package org.joda.time;

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
import java.lang.NullPointerException;
import static org.joda.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class Partial_with_1879100418185 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term85710;
     Object term89310;

    public Partial_with_1879100418185() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term85710 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term84784 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 136);
        Object term85830 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term85950 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term86070 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term86190 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term86310 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term86430 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term86550 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term86670 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term86790 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term86910 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term87030 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term87150 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term87270 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term87390 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term87510 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term87630 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term87750 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term87870 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term87990 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term88110 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term88230 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term88350 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term88470 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term88590 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term88710 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term88830 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term88950 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term89070 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term89190 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setElement(term84784, 0, term85830);
        setElement(term84784, 1, term85950);
        setElement(term84784, 2, term86070);
        setElement(term84784, 3, term86190);
        setElement(term84784, 4, term86310);
        setElement(term84784, 5, term86430);
        setElement(term84784, 6, term86550);
        setElement(term84784, 7, term86670);
        setElement(term84784, 8, term86790);
        setElement(term84784, 9, term86670);
        setElement(term84784, 10, term86910);
        setElement(term84784, 11, term86550);
        setElement(term84784, 12, term87030);
        setElement(term84784, 13, term87030);
        setElement(term84784, 14, term87150);
        setElement(term84784, 16, term87270);
        setElement(term84784, 17, term87030);
        setElement(term84784, 18, term87390);
        setElement(term84784, 19, term87510);
        setElement(term84784, 20, term86310);
        setElement(term84784, 21, term87270);
        setElement(term84784, 22, term86310);
        setElement(term84784, 23, term87630);
        setElement(term84784, 24, term86550);
        setElement(term84784, 25, term87630);
        setElement(term84784, 26, term86910);
        setElement(term84784, 27, term86910);
        setElement(term84784, 28, term86910);
        setElement(term84784, 29, term87750);
        setElement(term84784, 30, term87870);
        setElement(term84784, 31, term87990);
        setElement(term84784, 32, term88110);
        setElement(term84784, 34, term88230);
        setElement(term84784, 35, term86910);
        setElement(term84784, 36, term86910);
        setElement(term84784, 37, term86910);
        setElement(term84784, 38, term86910);
        setElement(term84784, 39, term86910);
        setElement(term84784, 40, term86910);
        setElement(term84784, 41, term86910);
        setElement(term84784, 42, term86910);
        setElement(term84784, 43, term88350);
        setElement(term84784, 44, term87750);
        setElement(term84784, 45, term86430);
        setElement(term84784, 46, term88230);
        setElement(term84784, 47, term88470);
        setElement(term84784, 48, term87510);
        setElement(term84784, 49, term88590);
        setElement(term84784, 56, term87270);
        setElement(term84784, 58, term86910);
        setElement(term84784, 59, term86910);
        setElement(term84784, 60, term86910);
        setElement(term84784, 61, term86910);
        setElement(term84784, 62, term86910);
        setElement(term84784, 64, term88710);
        setElement(term84784, 65, term86910);
        setElement(term84784, 66, term86910);
        setElement(term84784, 68, term86910);
        setElement(term84784, 69, term86910);
        setElement(term84784, 70, term86910);
        setElement(term84784, 72, term86910);
        setElement(term84784, 73, term85830);
        setElement(term84784, 74, term87630);
        setElement(term84784, 76, term87870);
        setElement(term84784, 77, term85950);
        setElement(term84784, 78, term87750);
        setElement(term84784, 80, term88470);
        setElement(term84784, 81, term88590);
        setElement(term84784, 82, term88110);
        setElement(term84784, 84, term86910);
        setElement(term84784, 85, term86910);
        setElement(term84784, 86, term86910);
        setElement(term84784, 87, term86910);
        setElement(term84784, 88, term86910);
        setElement(term84784, 89, term86910);
        setElement(term84784, 90, term86430);
        setElement(term84784, 91, term86910);
        setElement(term84784, 92, term88230);
        setElement(term84784, 93, term86910);
        setElement(term84784, 94, term86910);
        setElement(term84784, 95, term86910);
        setElement(term84784, 96, term87510);
        setElement(term84784, 97, term88110);
        setElement(term84784, 98, term86910);
        setElement(term84784, 99, term86910);
        setElement(term84784, 100, term86910);
        setElement(term84784, 101, term86910);
        setElement(term84784, 102, term88830);
        setElement(term84784, 106, term86430);
        setElement(term84784, 107, term88950);
        setElement(term84784, 108, term88950);
        setElement(term84784, 109, term88590);
        setElement(term84784, 110, term88110);
        setElement(term84784, 111, term86670);
        setElement(term84784, 112, term89070);
        setElement(term84784, 113, term87390);
        setElement(term84784, 114, term88470);
        setElement(term84784, 115, term88830);
        setElement(term84784, 119, term87390);
        setElement(term84784, 120, term88110);
        setElement(term84784, 121, term86190);
        setElement(term84784, 123, term88830);
        setElement(term84784, 127, term86190);
        setElement(term84784, 131, term88470);
        setElement(term84784, 133, term89190);
        setElement(term84784, 135, term87510);
        setField(term85710, term85710.getClass(), "iTypes", term84784);
        term89310 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeFieldType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term89310;
        args[1] = 0;
        try {
            callMethod(klass, "with", argTypes, term85710, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


