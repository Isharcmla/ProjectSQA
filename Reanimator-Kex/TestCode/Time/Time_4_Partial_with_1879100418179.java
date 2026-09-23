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

public class Partial_with_1879100418179 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term74888;
     Object term78488;

    public Partial_with_1879100418179() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term74888 = newInstance(Class.forName("org.joda.time.Partial"));
        Object[] term73674 = (Object[]) newArray("org.joda.time.DateTimeFieldType", 184);
        Object term75008 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term75128 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term75248 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term75368 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term75488 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term75608 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term75728 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term75848 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term75968 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term76088 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term76208 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term76328 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term76448 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term76568 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term76688 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term76808 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term76928 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term77048 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term77168 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term77288 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term77408 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term77528 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term77648 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term77768 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term77888 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term78008 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term78128 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term78248 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        Object term78368 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
        setElement(term73674, 0, term75008);
        setElement(term73674, 1, term75128);
        setElement(term73674, 2, term75248);
        setElement(term73674, 3, term75368);
        setElement(term73674, 4, term75488);
        setElement(term73674, 5, term75608);
        setElement(term73674, 6, term75728);
        setElement(term73674, 7, term75848);
        setElement(term73674, 8, term75608);
        setElement(term73674, 10, term75608);
        setElement(term73674, 11, term75728);
        setElement(term73674, 12, term75968);
        setElement(term73674, 13, term76088);
        setElement(term73674, 14, term75128);
        setElement(term73674, 15, term75728);
        setElement(term73674, 16, term76208);
        setElement(term73674, 17, term76328);
        setElement(term73674, 18, term76328);
        setElement(term73674, 19, term76448);
        setElement(term73674, 20, term76568);
        setElement(term73674, 21, term76688);
        setElement(term73674, 22, term76328);
        setElement(term73674, 23, term76808);
        setElement(term73674, 24, term75248);
        setElement(term73674, 27, term76808);
        setElement(term73674, 28, term76568);
        setElement(term73674, 29, term76568);
        setElement(term73674, 30, term75848);
        setElement(term73674, 31, term75248);
        setElement(term73674, 32, term76208);
        setElement(term73674, 33, term76928);
        setElement(term73674, 34, term77048);
        setElement(term73674, 35, term75608);
        setElement(term73674, 36, term76448);
        setElement(term73674, 37, term76808);
        setElement(term73674, 38, term77168);
        setElement(term73674, 39, term75608);
        setElement(term73674, 40, term75608);
        setElement(term73674, 41, term75728);
        setElement(term73674, 42, term76808);
        setElement(term73674, 43, term76568);
        setElement(term73674, 44, term76208);
        setElement(term73674, 45, term76808);
        setElement(term73674, 46, term76328);
        setElement(term73674, 47, term75608);
        setElement(term73674, 48, term75608);
        setElement(term73674, 49, term77288);
        setElement(term73674, 50, term77408);
        setElement(term73674, 51, term75608);
        setElement(term73674, 52, term75608);
        setElement(term73674, 53, term75848);
        setElement(term73674, 54, term77528);
        setElement(term73674, 55, term76568);
        setElement(term73674, 56, term76568);
        setElement(term73674, 58, term77648);
        setElement(term73674, 59, term77768);
        setElement(term73674, 60, term77888);
        setElement(term73674, 61, term75488);
        setElement(term73674, 62, term75848);
        setElement(term73674, 63, term76088);
        setElement(term73674, 64, term76568);
        setElement(term73674, 65, term76208);
        setElement(term73674, 66, term75368);
        setElement(term73674, 67, term77888);
        setElement(term73674, 68, term77528);
        setElement(term73674, 69, term75248);
        setElement(term73674, 70, term78008);
        setElement(term73674, 71, term77648);
        setElement(term73674, 72, term77408);
        setElement(term73674, 73, term77888);
        setElement(term73674, 74, term75968);
        setElement(term73674, 75, term77168);
        setElement(term73674, 76, term76208);
        setElement(term73674, 77, term76568);
        setElement(term73674, 78, term78128);
        setElement(term73674, 79, term78248);
        setElement(term73674, 80, term76568);
        setElement(term73674, 81, term77768);
        setElement(term73674, 82, term78368);
        setElement(term73674, 83, term76568);
        setElement(term73674, 84, term76568);
        setElement(term73674, 85, term76568);
        setElement(term73674, 152, term77408);
        setField(term74888, term74888.getClass(), "iTypes", term73674);
        term78488 = newInstance(Class.forName("org.joda.time.DateTimeFieldType$StandardDateTimeFieldType"));
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.joda.time.Partial");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("org.joda.time.DateTimeFieldType");
        argTypes[1] = int.class;
        Object[] args = new Object[2];
        args[0] = term78488;
        args[1] = 0;
        try {
            callMethod(klass, "with", argTypes, term74888, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


