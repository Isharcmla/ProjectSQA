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
import java.lang.ArrayIndexOutOfBoundsException;
import static org.apache.commons.lang3.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.Character;
import java.lang.Integer;

public class StringUtils_join_1501148232239 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2895;
     Object term2901;
     Object term2903;
     Object term2905;

    public StringUtils_join_1501148232239() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2895 = (Object[]) newArray("java.lang.Object", 5);
        Object term2896 = newInstance(Class.forName("java.lang.Object"));
        Object term2897 = newInstance(Class.forName("java.lang.Object"));
        Object term2898 = newInstance(Class.forName("java.lang.Object"));
        Object term2899 = newInstance(Class.forName("java.lang.Object"));
        Object term2900 = newInstance(Class.forName("java.lang.Object"));
        setElement(term2895, 0, term2896);
        setElement(term2895, 1, term2897);
        setElement(term2895, 2, term2898);
        setElement(term2895, 3, term2899);
        setElement(term2895, 4, term2900);
        term2901 = new Character('Q');
        term2903 = new Integer(-2068769794);
        term2905 = new Integer(-117576464);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.StringUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = char.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term2895;
        args[1] = term2901;
        args[2] = term2903;
        args[3] = term2905;
        try {
            callMethod(klass, "join", argTypes, null, args);
            assertTrue(false);
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }

    }

};


