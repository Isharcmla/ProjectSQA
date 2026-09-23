package org.apache.commons.lang3.time;

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
import static org.apache.commons.lang3.time.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.apache.commons.lang3.time.EqualityUtils.*;
import java.lang.Object;

public class FastDateParser_createKeyValues_80707483457 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8071;
     Object term8156;
     Object term15046;
     Object term15047;
     Object term15062;
     Object term15065;
     Object term15068;
     Object term15071;
     Object term15074;
     Object term14812;

    public FastDateParser_createKeyValues_80707483457() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term8071 = (Object[]) newArray("java.lang.String", 7);
        setElement(term8071, 0, "aNWLJdrZMq");
        setElement(term8071, 1, "HHmNoYxIGj");
        setElement(term8071, 2, "PtirvZmsGt");
        setElement(term8071, 3, "HWkpTmtlrc");
        setElement(term8071, 4, "hMmaoREuCK");
        setElement(term8071, 5, "VeDtgDzGAN");
        setElement(term8071, 6, "aWYOWZFyaX");
        term8156 = (Object[]) newArray("java.lang.String", 1);
        setElement(term8156, 0, "BRIVNtfUWU");
        term15046 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser$1"));
        term15047 = (Object[]) newArray("java.lang.String", 7);
        setElement(term15047, 0, "aNWLJdrZMq");
        setElement(term15047, 1, "HHmNoYxIGj");
        setElement(term15047, 2, "PtirvZmsGt");
        setElement(term15047, 3, "HWkpTmtlrc");
        setElement(term15047, 4, "hMmaoREuCK");
        setElement(term15047, 5, "VeDtgDzGAN");
        setElement(term15047, 6, "aWYOWZFyaX");
        term15062 = (Object[]) newArray("java.lang.String", 1);
        setElement(term15062, 0, "BRIVNtfUWU");
        term15065 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser$KeyValue"));
        setField(term15065, term15065.getClass(), "key", "BRIVNtfUWU");
        setIntField(term15065, term15065.getClass(), "value", 0);
        term15068 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser$KeyValue"));
        setField(term15068, term15068.getClass(), "key", "HHmNoYxIGj");
        setIntField(term15068, term15068.getClass(), "value", 1);
        term15071 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser$KeyValue"));
        setField(term15071, term15071.getClass(), "key", "BRIVNtfUWU");
        setIntField(term15071, term15071.getClass(), "value", 0);
        term15074 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser$KeyValue"));
        setField(term15074, term15074.getClass(), "key", "HHmNoYxIGj");
        setIntField(term15074, term15074.getClass(), "value", 1);
        term14812 = (Object[]) newArray("org.apache.commons.lang3.time.FastDateParser$KeyValue", 8);
        Object term14813 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser$KeyValue"));
        Object term14827 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser$KeyValue"));
        Object term14841 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser$KeyValue"));
        Object term14855 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser$KeyValue"));
        Object term14869 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser$KeyValue"));
        Object term14883 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser$KeyValue"));
        Object term14897 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser$KeyValue"));
        Object term14911 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser$KeyValue"));
        setField(term14813, term14813.getClass(), "key", "aNWLJdrZMq");
        setIntField(term14813, term14813.getClass(), "value", 0);
        setElement(term14812, 0, term14813);
        setField(term14827, term14827.getClass(), "key", "aWYOWZFyaX");
        setIntField(term14827, term14827.getClass(), "value", 6);
        setElement(term14812, 1, term14827);
        setField(term14841, term14841.getClass(), "key", "BRIVNtfUWU");
        setIntField(term14841, term14841.getClass(), "value", 0);
        setElement(term14812, 2, term14841);
        setField(term14855, term14855.getClass(), "key", "HHmNoYxIGj");
        setIntField(term14855, term14855.getClass(), "value", 1);
        setElement(term14812, 3, term14855);
        setField(term14869, term14869.getClass(), "key", "hMmaoREuCK");
        setIntField(term14869, term14869.getClass(), "value", 4);
        setElement(term14812, 4, term14869);
        setField(term14883, term14883.getClass(), "key", "HWkpTmtlrc");
        setIntField(term14883, term14883.getClass(), "value", 3);
        setElement(term14812, 5, term14883);
        setField(term14897, term14897.getClass(), "key", "PtirvZmsGt");
        setIntField(term14897, term14897.getClass(), "value", 2);
        setElement(term14812, 6, term14897);
        setField(term14911, term14911.getClass(), "key", "VeDtgDzGAN");
        setIntField(term14911, term14911.getClass(), "value", 5);
        setElement(term14812, 7, term14911);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.apache.commons.lang3.time.FastDateParser");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        argTypes[1] = Array.newInstance(Class.forName("java.lang.String"), 0).getClass();
        Object[] args = new Object[2];
        args[0] = term8071;
        args[1] = term8156;
        Object retValue = callMethod(klass, "createKeyValues", argTypes, null, args);
        assertTrue(recursiveEquals(null, term15046));
        assertTrue(recursiveEquals(term8071, term15047));
        assertTrue(recursiveEquals(term8156, term15062));
        assertTrue(recursiveEquals(retValue, term14812));
    }

};


