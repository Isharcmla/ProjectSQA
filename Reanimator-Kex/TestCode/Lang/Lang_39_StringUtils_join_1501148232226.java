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
import java.lang.Integer;

public class StringUtils_join_1501148232226 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2863;
     Object term2869;
     Object term2871;
     Object term2873;
     Object term14514;

    public StringUtils_join_1501148232226() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2863 = (Object[]) newArray("java.lang.Object", 5);
        Object term2864 = newInstance(Class.forName("java.lang.Object"));
        Object term2865 = newInstance(Class.forName("java.lang.Object"));
        Object term2866 = newInstance(Class.forName("java.lang.Object"));
        Object term2867 = newInstance(Class.forName("java.lang.Object"));
        Object term2868 = newInstance(Class.forName("java.lang.Object"));
        setElement(term2863, 0, term2864);
        setElement(term2863, 1, term2865);
        setElement(term2863, 2, term2866);
        setElement(term2863, 3, term2867);
        setElement(term2863, 4, term2868);
        term2869 = new Character('Q');
        term2871 = new Integer(1622346318);
        term2873 = new Integer(1048535127);
        term14514 = (Object[]) newArray("java.lang.Object", 5);
        Object term14515 = newInstance(Class.forName("java.lang.Object"));
        Object term14516 = newInstance(Class.forName("java.lang.Object"));
        Object term14517 = newInstance(Class.forName("java.lang.Object"));
        Object term14518 = newInstance(Class.forName("java.lang.Object"));
        Object term14519 = newInstance(Class.forName("java.lang.Object"));
        setElement(term14514, 0, term14515);
        setElement(term14514, 1, term14516);
        setElement(term14514, 2, term14517);
        setElement(term14514, 3, term14518);
        setElement(term14514, 4, term14519);
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
        args[0] = term2863;
        args[1] = term2869;
        args[2] = term2871;
        args[3] = term2873;
        Object retValue = callMethod(klass, "join", argTypes, null, args);
        assertTrue(recursiveEquals(term2863, term14514));
        assertTrue(recursiveEquals(term2869, 'Q'));
        assertTrue(recursiveEquals(term2871, 1622346318));
        assertTrue(recursiveEquals(term2873, 1048535127));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


