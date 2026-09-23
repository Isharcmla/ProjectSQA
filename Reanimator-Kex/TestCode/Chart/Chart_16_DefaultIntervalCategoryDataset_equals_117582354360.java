package org.jfree.data.category;

import java.lang.Throwable;
import java.lang.IllegalStateException;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.Timeout;
import java.util.concurrent.TimeUnit;
import org.junit.Before;
import java.lang.Class;
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import static org.jfree.data.category.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jfree.data.category.EqualityUtils.*;
import java.lang.Object;

public class DefaultIntervalCategoryDataset_equals_117582354360 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term859;
     Object term890;
     Object term9256;
     Object term9283;

    public DefaultIntervalCategoryDataset_equals_117582354360() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term859 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term860 = (Object[]) newArray("java.lang.Comparable", 4);
        Object[] term861 = (Object[]) newArray("java.lang.Comparable", 2);
        Object[] term862 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 8);
        Object[] term863 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term864 = (Object[]) newArray("java.lang.Number", 7);
        Object[] term865 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term866 = (Object[]) newArray("java.lang.Number", 9);
        Object[] term867 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term868 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term869 = (Object[]) newArray("java.lang.Number", 1);
        Object[] term870 = (Object[]) newArray("java.lang.Number", 1);
        Object[] term871 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 9);
        Object[] term872 = (Object[]) newArray("java.lang.Number", 1);
        Object[] term873 = (Object[]) newArray("java.lang.Number", 4);
        Object[] term874 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term875 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term876 = (Object[]) newArray("java.lang.Number", 1);
        Object[] term877 = (Object[]) newArray("java.lang.Number", 1);
        Object[] term878 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term879 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term880 = (Object[]) newArray("java.lang.Number", 0);
        Object term881 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term888 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term889 = (Object[]) newArray("java.lang.Object", 0);
        setField(term859, term859.getClass(), "seriesKeys", term860);
        setField(term859, term859.getClass(), "categoryKeys", term861);
        setElement(term862, 0, term863);
        setElement(term862, 1, term864);
        setElement(term862, 2, term865);
        setElement(term862, 3, term866);
        setElement(term862, 4, term867);
        setElement(term862, 5, term868);
        setElement(term862, 6, term869);
        setElement(term862, 7, term870);
        setField(term859, term859.getClass(), "startData", term862);
        setElement(term871, 0, term872);
        setElement(term871, 1, term873);
        setElement(term871, 2, term874);
        setElement(term871, 3, term875);
        setElement(term871, 4, term876);
        setElement(term871, 5, term877);
        setElement(term871, 6, term878);
        setElement(term871, 7, term879);
        setElement(term871, 8, term880);
        setField(term859, term859.getClass(), "endData", term871);
        setField(term881, term881.getClass(), "id", "NOID");
        setField(term859, term859.getClass(), "group", term881);
        setField(term888, term888.getClass(), "listenerList", term889);
        setField(term859, term859.getClass(), "listenerList", term888);
        term890 = newInstance(Class.forName("java.lang.Object"));
        term9256 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term9257 = (Object[]) newArray("java.lang.Comparable", 4);
        Object[] term9258 = (Object[]) newArray("java.lang.Comparable", 2);
        Object[] term9259 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 8);
        Object[] term9260 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term9261 = (Object[]) newArray("java.lang.Number", 7);
        Object[] term9262 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term9263 = (Object[]) newArray("java.lang.Number", 9);
        Object[] term9264 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term9265 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term9266 = (Object[]) newArray("java.lang.Number", 1);
        Object[] term9267 = (Object[]) newArray("java.lang.Number", 1);
        Object[] term9268 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 9);
        Object[] term9269 = (Object[]) newArray("java.lang.Number", 1);
        Object[] term9270 = (Object[]) newArray("java.lang.Number", 4);
        Object[] term9271 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term9272 = (Object[]) newArray("java.lang.Number", 2);
        Object[] term9273 = (Object[]) newArray("java.lang.Number", 1);
        Object[] term9274 = (Object[]) newArray("java.lang.Number", 1);
        Object[] term9275 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term9276 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term9277 = (Object[]) newArray("java.lang.Number", 0);
        Object term9278 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term9281 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term9282 = (Object[]) newArray("java.lang.Object", 0);
        setField(term9256, term9256.getClass(), "seriesKeys", term9257);
        setField(term9256, term9256.getClass(), "categoryKeys", term9258);
        setElement(term9259, 0, term9260);
        setElement(term9259, 1, term9261);
        setElement(term9259, 2, term9262);
        setElement(term9259, 3, term9263);
        setElement(term9259, 4, term9264);
        setElement(term9259, 5, term9265);
        setElement(term9259, 6, term9266);
        setElement(term9259, 7, term9267);
        setField(term9256, term9256.getClass(), "startData", term9259);
        setElement(term9268, 0, term9269);
        setElement(term9268, 1, term9270);
        setElement(term9268, 2, term9271);
        setElement(term9268, 3, term9272);
        setElement(term9268, 4, term9273);
        setElement(term9268, 5, term9274);
        setElement(term9268, 6, term9275);
        setElement(term9268, 7, term9276);
        setElement(term9268, 8, term9277);
        setField(term9256, term9256.getClass(), "endData", term9268);
        setField(term9278, term9278.getClass(), "id", "NOID");
        setField(term9256, term9256.getClass(), "group", term9278);
        setField(term9281, term9281.getClass(), "listenerList", term9282);
        setField(term9256, term9256.getClass(), "listenerList", term9281);
        term9283 = newInstance(Class.forName("java.lang.Object"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.Object");
        Object[] args = new Object[1];
        args[0] = term890;
        Object retValue = callMethod(klass, "equals", argTypes, term859, args);
        assertTrue(recursiveEquals(term859, term9256));
        assertTrue(recursiveEquals(term890, term9283));
        assertTrue(recursiveEquals(retValue, false));
    }

};


