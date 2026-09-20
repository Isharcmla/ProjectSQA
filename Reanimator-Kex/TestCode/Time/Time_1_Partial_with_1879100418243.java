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

public class Partial_with_1879100418243 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term155286;
     Object term158166;

    public Partial_with_1879100418243() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term155286 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term154174 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 169);
        Object term155406 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term155526 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term155646 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term155766 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term155886 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term156006 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term156126 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term156246 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term156366 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term156486 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term156606 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term156726 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term156846 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term156966 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term157086 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term157206 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term157326 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term157446 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term157566 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term157686 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term157806 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term157926 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term158046 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setElement(term154174, 0, term155406);
        setElement(term154174, 3, term155526);
        setElement(term154174, 5, term155406);
        setElement(term154174, 6, term155646);
        setElement(term154174, 7, term155766);
        setElement(term154174, 8, term155886);
        setElement(term154174, 11, term156006);
        setElement(term154174, 12, term156126);
        setElement(term154174, 13, term156246);
        setElement(term154174, 14, term156366);
        setElement(term154174, 17, term156486);
        setElement(term154174, 19, term156606);
        setElement(term154174, 23, term156606);
        setElement(term154174, 26, term156726);
        setElement(term154174, 27, term156486);
        setElement(term154174, 28, term156006);
        setElement(term154174, 29, term156846);
        setElement(term154174, 33, term156966);
        setElement(term154174, 34, term157086);
        setElement(term154174, 41, term156606);
        setElement(term154174, 45, term157086);
        setElement(term154174, 46, term155526);
        setElement(term154174, 48, term157206);
        setElement(term154174, 49, term156966);
        setElement(term154174, 51, term157206);
        setElement(term154174, 52, term157206);
        setElement(term154174, 53, term157206);
        setElement(term154174, 54, term157206);
        setElement(term154174, 55, term155646);
        setElement(term154174, 56, term157326);
        setElement(term154174, 57, term155406);
        setElement(term154174, 58, term157446);
        setElement(term154174, 59, term157566);
        setElement(term154174, 60, term156846);
        setElement(term154174, 61, term156966);
        setElement(term154174, 62, term157686);
        setElement(term154174, 63, term157806);
        setElement(term154174, 64, term157926);
        setElement(term154174, 65, term157206);
        setElement(term154174, 71, term156486);
        setElement(term154174, 72, term156486);
        setElement(term154174, 73, term156486);
        setElement(term154174, 74, term156486);
        setElement(term154174, 75, term156486);
        setElement(term154174, 76, term156486);
        setElement(term154174, 77, term156126);
        setElement(term154174, 78, term156486);
        setElement(term154174, 79, term156486);
        setElement(term154174, 80, term156486);
        setElement(term154174, 81, term156486);
        setElement(term154174, 82, term156486);
        setElement(term154174, 83, term156486);
        setElement(term154174, 84, term156486);
        setElement(term154174, 85, term156486);
        setElement(term154174, 86, term156486);
        setElement(term154174, 87, term156486);
        setElement(term154174, 88, term156486);
        setElement(term154174, 89, term156126);
        setElement(term154174, 162, term157086);
        setElement(term154174, 163, term155766);
        setElement(term154174, 164, term156606);
        setElement(term154174, 165, term156606);
        setElement(term154174, 166, term157326);
        setElement(term154174, 167, term157326);
        setElement(term154174, 168, term158046);
        setField(term155286, term155286.getClass(), "iTypes", term154174);
        term158166 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeFieldType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term158166;
        args[1] = 0;
        try {
            callMethod(klass, "with", argTypes, term155286, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};
