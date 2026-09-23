package org.apache.commons.lang3;

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
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.EqualityUtils.*;
import java.lang.Object;
import java.lang.Character;

public class StringUtils_join_1313170632225 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2854;
     Object term2861;
     Object term14340;

    public StringUtils_join_1313170632225() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2854 = (Object[]) newArray("java.lang.Object", 6);
        Object term2855 = newInstance(Class.forName("java.lang.Object"));
        Object term2856 = newInstance(Class.forName("java.lang.Object"));
        Object term2857 = newInstance(Class.forName("java.lang.Object"));
        Object term2858 = newInstance(Class.forName("java.lang.Object"));
        Object term2859 = newInstance(Class.forName("java.lang.Object"));
        Object term2860 = newInstance(Class.forName("java.lang.Object"));
        setElement(term2854, 0, term2855);
        setElement(term2854, 1, term2856);
        setElement(term2854, 2, term2857);
        setElement(term2854, 3, term2858);
        setElement(term2854, 4, term2859);
        setElement(term2854, 5, term2860);
        term2861 = new Character('g');
        term14340 = (Object[]) newArray("java.lang.Object", 6);
        Object term14341 = newInstance(Class.forName("java.lang.Object"));
        Object term14342 = newInstance(Class.forName("java.lang.Object"));
        Object term14343 = newInstance(Class.forName("java.lang.Object"));
        Object term14344 = newInstance(Class.forName("java.lang.Object"));
        Object term14345 = newInstance(Class.forName("java.lang.Object"));
        Object term14346 = newInstance(Class.forName("java.lang.Object"));
        setElement(term14340, 0, term14341);
        setElement(term14340, 1, term14342);
        setElement(term14340, 2, term14343);
        setElement(term14340, 3, term14344);
        setElement(term14340, 4, term14345);
        setElement(term14340, 5, term14346);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = char.class;
        Object[] args = new Object[2];
        args[0] = term2854;
        args[1] = term2861;
        Object retValue = callMethod(klass, "join", argTypes, null, args);
        assertTrue(recursiveEquals(term2854, term14340));
        assertTrue(recursiveEquals(term2861, 'g'));
        assertTrue(recursiveEquals(retValue, "java.lang.Object@34d638abgjava.lang.Object@5cdca892gjava.lang.Object@3addbdf5gjava.lang.Object@5d9f87cagjava.lang.Object@539add0gjava.lang.Object@314d3b97"));
    }

};


