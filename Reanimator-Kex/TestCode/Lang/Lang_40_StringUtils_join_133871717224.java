package org.apache.commons.lang;

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
import static org.apache.commons.lang.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang.EqualityUtils.*;
import java.lang.Object;
import java.lang.Character;
import java.lang.Integer;

public class StringUtils_join_133871717224 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term2841;
     Object term2847;
     Object term2849;
     Object term2851;
     Object term14057;

    public StringUtils_join_133871717224() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term2841 = (Object[]) newArray("java.lang.Object", 5);
        Object term2842 = newInstance(Class.forName("java.lang.Object"));
        Object term2843 = newInstance(Class.forName("java.lang.Object"));
        Object term2844 = newInstance(Class.forName("java.lang.Object"));
        Object term2845 = newInstance(Class.forName("java.lang.Object"));
        Object term2846 = newInstance(Class.forName("java.lang.Object"));
        setElement(term2841, 0, term2842);
        setElement(term2841, 1, term2843);
        setElement(term2841, 2, term2844);
        setElement(term2841, 3, term2845);
        setElement(term2841, 4, term2846);
        term2847 = new Character('Q');
        term2849 = new Integer(1622346318);
        term2851 = new Integer(1048535127);
        term14057 = (Object[]) newArray("java.lang.Object", 5);
        Object term14058 = newInstance(Class.forName("java.lang.Object"));
        Object term14059 = newInstance(Class.forName("java.lang.Object"));
        Object term14060 = newInstance(Class.forName("java.lang.Object"));
        Object term14061 = newInstance(Class.forName("java.lang.Object"));
        Object term14062 = newInstance(Class.forName("java.lang.Object"));
        setElement(term14057, 0, term14058);
        setElement(term14057, 1, term14059);
        setElement(term14057, 2, term14060);
        setElement(term14057, 3, term14061);
        setElement(term14057, 4, term14062);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang.StringUtils");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        argTypes[1] = char.class;
        argTypes[2] = int.class;
        argTypes[3] = int.class;
        Object[] args = new Object[4];
        args[0] = term2841;
        args[1] = term2847;
        args[2] = term2849;
        args[3] = term2851;
        Object retValue = callMethod(klass, "join", argTypes, null, args);
        assertTrue(recursiveEquals(term2841, term14057));
        assertTrue(recursiveEquals(term2847, 'Q'));
        assertTrue(recursiveEquals(term2849, 1622346318));
        assertTrue(recursiveEquals(term2851, 1048535127));
        assertTrue(recursiveEquals(retValue, ""));
    }

};


