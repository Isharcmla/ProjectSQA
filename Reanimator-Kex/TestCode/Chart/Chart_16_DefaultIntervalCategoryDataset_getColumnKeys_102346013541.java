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

public class DefaultIntervalCategoryDataset_getColumnKeys_102346013541 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term296;
     Object term4499;
     Object term4469;

    public DefaultIntervalCategoryDataset_getColumnKeys_102346013541() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term296 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term297 = (Object[]) newArray("java.lang.Comparable", 1);
        Object[] term298 = (Object[]) newArray("java.lang.Comparable", 0);
        Object[] term299 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 6);
        Object[] term300 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term301 = (Object[]) newArray("java.lang.Number", 4);
        Object[] term302 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term303 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term304 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term305 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term306 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 6);
        Object[] term307 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term308 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term309 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term310 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term311 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term312 = (Object[]) newArray("java.lang.Number", 3);
        Object term313 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term320 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term321 = (Object[]) newArray("java.lang.Object", 0);
        setField(term296, term296.getClass(), "seriesKeys", term297);
        setField(term296, term296.getClass(), "categoryKeys", term298);
        setElement(term299, 0, term300);
        setElement(term299, 1, term301);
        setElement(term299, 2, term302);
        setElement(term299, 3, term303);
        setElement(term299, 4, term304);
        setElement(term299, 5, term305);
        setField(term296, term296.getClass(), "startData", term299);
        setElement(term306, 0, term307);
        setElement(term306, 1, term308);
        setElement(term306, 2, term309);
        setElement(term306, 3, term310);
        setElement(term306, 4, term311);
        setElement(term306, 5, term312);
        setField(term296, term296.getClass(), "endData", term306);
        setField(term313, term313.getClass(), "id", "NOID");
        setField(term296, term296.getClass(), "group", term313);
        setField(term320, term320.getClass(), "listenerList", term321);
        setField(term296, term296.getClass(), "listenerList", term320);
        term4499 = newInstance(Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset"));
        Object[] term4500 = (Object[]) newArray("java.lang.Comparable", 1);
        Object[] term4501 = (Object[]) newArray("java.lang.Comparable", 0);
        Object[] term4502 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 6);
        Object[] term4503 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term4504 = (Object[]) newArray("java.lang.Number", 4);
        Object[] term4505 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term4506 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term4507 = (Object[]) newArray("java.lang.Number", 8);
        Object[] term4508 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term4509 = (Object[]) newObjectArray(Array.newInstance(Class.forName("java.lang.Number"), 0).getClass(), 6);
        Object[] term4510 = (Object[]) newArray("java.lang.Number", 3);
        Object[] term4511 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term4512 = (Object[]) newArray("java.lang.Number", 5);
        Object[] term4513 = (Object[]) newArray("java.lang.Number", 6);
        Object[] term4514 = (Object[]) newArray("java.lang.Number", 0);
        Object[] term4515 = (Object[]) newArray("java.lang.Number", 3);
        Object term4516 = newInstance(Class.forName("org.jfree.data.general.DatasetGroup"));
        Object term4519 = newInstance(Class.forName("javax.swing.event.EventListenerList"));
        Object[] term4520 = (Object[]) newArray("java.lang.Object", 0);
        setField(term4499, term4499.getClass(), "seriesKeys", term4500);
        setField(term4499, term4499.getClass(), "categoryKeys", term4501);
        setElement(term4502, 0, term4503);
        setElement(term4502, 1, term4504);
        setElement(term4502, 2, term4505);
        setElement(term4502, 3, term4506);
        setElement(term4502, 4, term4507);
        setElement(term4502, 5, term4508);
        setField(term4499, term4499.getClass(), "startData", term4502);
        setElement(term4509, 0, term4510);
        setElement(term4509, 1, term4511);
        setElement(term4509, 2, term4512);
        setElement(term4509, 3, term4513);
        setElement(term4509, 4, term4514);
        setElement(term4509, 5, term4515);
        setField(term4499, term4499.getClass(), "endData", term4509);
        setField(term4516, term4516.getClass(), "id", "NOID");
        setField(term4499, term4499.getClass(), "group", term4516);
        setField(term4519, term4519.getClass(), "listenerList", term4520);
        setField(term4499, term4499.getClass(), "listenerList", term4519);
        term4469 = newInstance(Class.forName("java.util.Collections$UnmodifiableRandomAccessList"));
        Object term4470 = newInstance(Class.forName("java.util.Arrays$ArrayList"));
        Object[] term4471 = (Object[]) newArray("java.lang.Comparable", 0);
        setField(term4470, term4470.getClass(), "a", term4471);
        setIntField(term4470, term4470.getClass(), "modCount", 0);
        setField(term4469, term4469.getClass(), "list", term4470);
        setField(term4469, term4469.getClass(), "c", term4470);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jfree.data.category.DefaultIntervalCategoryDataset");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        Object retValue = callMethod(klass, "getColumnKeys", argTypes, term296, args);
        assertTrue(recursiveEquals(term296, term4499));
        assertTrue(recursiveEquals(retValue, term4469));
    }

};


