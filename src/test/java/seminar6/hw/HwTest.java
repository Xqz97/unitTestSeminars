package seminar6.hw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

import java.util.List;

public class HwTest {
    @Test
    public void testCalculateAverage() {
        Hw hw = new Hw();
        List<Double> list = List.of(1.2, 3.4, 5.6);
        assertThat(hw.calculateAverage((list))).isEqualTo(3.4);
    }

    @Test
    public void testCompareAverages_firstListHasGreaterAverage() {
        Hw hw = new Hw();
        List<Double> list2 = List.of(1.2, 3.4, 5.6);
        List<Double> list1 = List.of(2.3, 4.5, 6.7);
        assertThat(hw.compareAverages(list1, list2)).isEqualTo("Первый список имеет большее среднее значение");
    }

    @Test
    public void testCompareAverages_secondListHasGreaterAverage() {
        Hw hw = new Hw();
        List<Double> list1 = List.of(1.2, 3.4, 5.6);
        List<Double> list2 = List.of(2.3, 4.5, 6.7);
        assertThat(hw.compareAverages(list1, list2)).isEqualTo("Второй список имеет большее среднее значение");
    }

    @Test
    public void testCompareAverages_equalAverages() {
        Hw hw = new Hw();
        List<Double> list1 = List.of(1.2, 3.4, 5.6);
        List<Double> list2 = List.of(1.2, 3.4, 5.6);
        assertThat(hw.compareAverages(list1, list2)).isEqualTo("Средние значения равны");
    }

}

