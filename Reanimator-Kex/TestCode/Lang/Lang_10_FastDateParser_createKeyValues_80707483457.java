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
     Object term15705;
     Object term15706;
     Object term15721;
     Object term15724;
     Object term15727;
     Object term15730;
     Object term15733;
     Object term15471;

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
        term15705 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser$1"));
        term15706 = (Object[]) newArray("java.lang.String", 7);
        setElement(term15706, 0, "aNWLJdrZMq");
        setElement(term15706, 1, "HHmNoYxIGj");
        setElement(term15706, 2, "PtirvZmsGt");
        setElement(term15706, 3, "HWkpTmtlrc");
        setElement(term15706, 4, "hMmaoREuCK");
        setElement(term15706, 5, "VeDtgDzGAN");
        setElement(term15706, 6, "aWYOWZFyaX");
        term15721 = (Object[]) newArray("java.lang.String", 1);
        setElement(term15721, 0, "BRIVNtfUWU");
        term15724 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser$KeyValue"));
        setField(term15724, term15724.getClass(), "key", "BRIVNtfUWU");
        setIntField(term15724, term15724.getClass(), "value", 0);
        term15727 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser$KeyValue"));
        setField(term15727, term15727.getClass(), "key", "HHmNoYxIGj");
        setIntField(term15727, term15727.getClass(), "value", 1);
        term15730 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser$KeyValue"));
        setField(term15730, term15730.getClass(), "key", "BRIVNtfUWU");
        setIntField(term15730, term15730.getClass(), "value", 0);
        term15733 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser$KeyValue"));
        setField(term15733, term15733.getClass(), "key", "HHmNoYxIGj");
        setIntField(term15733, term15733.getClass(), "value", 1);
        term15471 = (Object[]) newArray("org.apache.commons.lang3.time.FastDateParser$KeyValue", 8);
        Object term15472 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser$KeyValue"));
        Object term15486 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser$KeyValue"));
        Object term15500 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser$KeyValue"));
        Object term15514 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser$KeyValue"));
        Object term15528 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser$KeyValue"));
        Object term15542 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser$KeyValue"));
        Object term15556 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser$KeyValue"));
        Object term15570 = newInstance(Class.forName("org.apache.commons.lang3.time.FastDateParser$KeyValue"));
        setField(term15472, term15472.getClass(), "key", "aNWLJdrZMq");
        setIntField(term15472, term15472.getClass(), "value", 0);
        setElement(term15471, 0, term15472);
        setField(term15486, term15486.getClass(), "key", "aWYOWZFyaX");
        setIntField(term15486, term15486.getClass(), "value", 6);
        setElement(term15471, 1, term15486);
        setField(term15500, term15500.getClass(), "key", "BRIVNtfUWU");
        setIntField(term15500, term15500.getClass(), "value", 0);
        setElement(term15471, 2, term15500);
        setField(term15514, term15514.getClass(), "key", "HHmNoYxIGj");
        setIntField(term15514, term15514.getClass(), "value", 1);
        setElement(term15471, 3, term15514);
        setField(term15528, term15528.getClass(), "key", "hMmaoREuCK");
        setIntField(term15528, term15528.getClass(), "value", 4);
        setElement(term15471, 4, term15528);
        setField(term15542, term15542.getClass(), "key", "HWkpTmtlrc");
        setIntField(term15542, term15542.getClass(), "value", 3);
        setElement(term15471, 5, term15542);
        setField(term15556, term15556.getClass(), "key", "PtirvZmsGt");
        setIntField(term15556, term15556.getClass(), "value", 2);
        setElement(term15471, 6, term15556);
        setField(term15570, term15570.getClass(), "key", "VeDtgDzGAN");
        setIntField(term15570, term15570.getClass(), "value", 5);
        setElement(term15471, 7, term15570);
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
        assertTrue(recursiveEquals(null, term15705));
        assertTrue(recursiveEquals(term8071, term15706));
        assertTrue(recursiveEquals(term8156, term15721));
        assertTrue(recursiveEquals(retValue, term15471));
    }

};


