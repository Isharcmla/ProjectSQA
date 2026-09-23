package com.google.gson.internal.bind;

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
import static com.google.gson.internal.bind.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class JsonTreeReader_peek_4674632836 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1220;

    public JsonTreeReader_peek_4674632836() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1220 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term1221 = (Object[]) newArray("java.lang.Object", 5);
        Object term1222 = newInstance(Class.forName("java.lang.Object"));
        Object term1223 = newInstance(Class.forName("java.lang.Object"));
        Object term1224 = newInstance(Class.forName("java.lang.Object"));
        Object term1225 = newInstance(Class.forName("java.lang.Object"));
        Object term1226 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1323 = (Object[]) newArray("java.lang.String", 4);
        int[] term1372 = (int[]) newIntArray(8);
        char[] term1292 = (char[]) newCharArray(0);
        int[] term1312 = (int[]) newIntArray(9);
        setElement(term1221, 0, term1222);
        setElement(term1221, 1, term1223);
        setElement(term1221, 2, term1224);
        setElement(term1221, 3, term1225);
        setElement(term1221, 4, term1226);
        setField(term1220, term1220.getClass(), "stack", term1221);
        setIntField(term1220, term1220.getClass(), "stackSize", -893623680);
        setElement(term1323, 0, "dEnhdmILtU");
        setElement(term1323, 1, "hoicvmsovO");
        setElement(term1323, 2, "eqJfYWRaEL");
        setElement(term1323, 3, "fhkbdRViHi");
        setField(term1220, term1220.getClass(), "pathNames", term1323);
        setIntElement(term1372, 0, -1963434938);
        setIntElement(term1372, 1, 906181092);
        setIntElement(term1372, 2, 1045657203);
        setIntElement(term1372, 3, 1386130016);
        setIntElement(term1372, 4, 1072005683);
        setIntElement(term1372, 5, 1861318859);
        setIntElement(term1372, 6, 1474524152);
        setIntElement(term1372, 7, 568954359);
        setField(term1220, term1220.getClass(), "pathIndices", term1372);
        setField(term1220, term1220.getClass(), "in", null);
        setBooleanField(term1220, term1220.getClass(), "lenient", true);
        setField(term1220, term1220.getClass(), "buffer", term1292);
        setIntField(term1220, term1220.getClass(), "pos", -1888585309);
        setIntField(term1220, term1220.getClass(), "limit", 683666002);
        setIntField(term1220, term1220.getClass(), "lineNumber", 1596213415);
        setIntField(term1220, term1220.getClass(), "lineStart", -268815336);
        setIntField(term1220, term1220.getClass(), "peeked", -1210583429);
        setLongField(term1220, term1220.getClass(), "peekedLong", 7411271909051562686L);
        setIntField(term1220, term1220.getClass(), "peekedNumberLength", -663691365);
        setField(term1220, term1220.getClass(), "peekedString", "ieCtQFdkii");
        setIntElement(term1312, 0, 339854490);
        setIntElement(term1312, 1, -615654495);
        setIntElement(term1312, 2, -1476117762);
        setIntElement(term1312, 3, -341962980);
        setIntElement(term1312, 4, 1532716628);
        setIntElement(term1312, 5, -1801760683);
        setIntElement(term1312, 6, 1141317871);
        setIntElement(term1312, 7, 890669485);
        setIntElement(term1312, 8, 691577392);
        setField(term1220, term1220.getClass(), "stack", term1312);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "peek", argTypes, term1220, args);
    }

};


