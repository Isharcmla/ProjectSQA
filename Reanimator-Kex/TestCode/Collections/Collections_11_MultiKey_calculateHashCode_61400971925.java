package org.apache.commons.collections.keyvalue;

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
import static org.apache.commons.collections.keyvalue.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.collections.keyvalue.EqualityUtils.*;
import java.lang.Object;

public class MultiKey_calculateHashCode_61400971925 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term65;
     Object term74;
     Object term973;
     Object term982;

    public MultiKey_calculateHashCode_61400971925() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term65 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object[] term66 = (Object[]) newArray("java.lang.Object", 7);
        Object term67 = newInstance(Class.forName("java.lang.Object"));
        Object term68 = newInstance(Class.forName("java.lang.Object"));
        Object term69 = newInstance(Class.forName("java.lang.Object"));
        Object term70 = newInstance(Class.forName("java.lang.Object"));
        Object term71 = newInstance(Class.forName("java.lang.Object"));
        Object term72 = newInstance(Class.forName("java.lang.Object"));
        Object term73 = newInstance(Class.forName("java.lang.Object"));
        setElement(term66, 0, term67);
        setElement(term66, 1, term68);
        setElement(term66, 2, term69);
        setElement(term66, 3, term70);
        setElement(term66, 4, term71);
        setElement(term66, 5, term72);
        setElement(term66, 6, term73);
        setField(term65, term65.getClass(), "keys", term66);
        term74 = (Object[]) newArray("java.lang.Object", 1);
        Object term75 = newInstance(Class.forName("java.lang.Object"));
        setElement(term74, 0, term75);
        term973 = newInstance(Class.forName("org.apache.commons.collections.keyvalue.MultiKey"));
        Object[] term974 = (Object[]) newArray("java.lang.Object", 7);
        Object term975 = newInstance(Class.forName("java.lang.Object"));
        Object term976 = newInstance(Class.forName("java.lang.Object"));
        Object term977 = newInstance(Class.forName("java.lang.Object"));
        Object term978 = newInstance(Class.forName("java.lang.Object"));
        Object term979 = newInstance(Class.forName("java.lang.Object"));
        Object term980 = newInstance(Class.forName("java.lang.Object"));
        Object term981 = newInstance(Class.forName("java.lang.Object"));
        setElement(term974, 0, term975);
        setElement(term974, 1, term976);
        setElement(term974, 2, term977);
        setElement(term974, 3, term978);
        setElement(term974, 4, term979);
        setElement(term974, 5, term980);
        setElement(term974, 6, term981);
        setField(term973, term973.getClass(), "keys", term974);
        term982 = (Object[]) newArray("java.lang.Object", 1);
        Object term983 = newInstance(Class.forName("java.lang.Object"));
        setElement(term982, 0, term983);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.collections.keyvalue.MultiKey");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.Object"), 0).getClass();
        Object[] args = new Object[1];
        args[0] = term74;
        callMethod(klass, "calculateHashCode", argTypes, term65, args);
        assertTrue(recursiveEquals(term65, term973));
        assertTrue(recursiveEquals(term74, term982));
    }

};


