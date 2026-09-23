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

public class JsonTreeReader_skipValue_110865104018 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4216;

    public JsonTreeReader_skipValue_110865104018() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4216 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term4217 = (Object[]) newArray("java.lang.Object", 6);
        Object term4218 = newInstance(Class.forName("java.lang.Object"));
        Object term4219 = newInstance(Class.forName("java.lang.Object"));
        Object term4220 = newInstance(Class.forName("java.lang.Object"));
        Object term4221 = newInstance(Class.forName("java.lang.Object"));
        Object term4222 = newInstance(Class.forName("java.lang.Object"));
        Object term4223 = newInstance(Class.forName("java.lang.Object"));
        Object[] term4303 = (Object[]) newArray("java.lang.String", 8);
        int[] term4400 = (int[]) newIntArray(5);
        char[] term4268 = (char[]) newCharArray(5);
        int[] term4293 = (int[]) newIntArray(8);
        setElement(term4217, 0, term4218);
        setElement(term4217, 1, term4219);
        setElement(term4217, 2, term4220);
        setElement(term4217, 3, term4221);
        setElement(term4217, 4, term4222);
        setElement(term4217, 5, term4223);
        setField(term4216, term4216.getClass(), "stack", term4217);
        setIntField(term4216, term4216.getClass(), "stackSize", 1137624258);
        setElement(term4303, 0, "cudZvLMQon");
        setElement(term4303, 1, "lihXWlGDxk");
        setElement(term4303, 2, "JmcmxoGhIK");
        setElement(term4303, 3, "jXzmYyrnnT");
        setElement(term4303, 4, "igCAtimmYB");
        setElement(term4303, 5, "DyiXbeYIaN");
        setElement(term4303, 6, "VGizxZnyHX");
        setElement(term4303, 7, "kVEZMHmRtR");
        setField(term4216, term4216.getClass(), "pathNames", term4303);
        setIntElement(term4400, 0, 977862393);
        setIntElement(term4400, 1, 301401782);
        setIntElement(term4400, 2, 1988605357);
        setIntElement(term4400, 3, 808203320);
        setIntElement(term4400, 4, -544382127);
        setField(term4216, term4216.getClass(), "pathIndices", term4400);
        setField(term4216, term4216.getClass(), "in", null);
        setBooleanField(term4216, term4216.getClass(), "lenient", true);
        setCharElement(term4268, 0, 'j');
        setCharElement(term4268, 1, 'G');
        setCharElement(term4268, 2, 'Y');
        setCharElement(term4268, 3, 'S');
        setCharElement(term4268, 4, 'R');
        setField(term4216, term4216.getClass(), "buffer", term4268);
        setIntField(term4216, term4216.getClass(), "pos", -1148142995);
        setIntField(term4216, term4216.getClass(), "limit", -233024044);
        setIntField(term4216, term4216.getClass(), "lineNumber", 1820784228);
        setIntField(term4216, term4216.getClass(), "lineStart", 1390820006);
        setIntField(term4216, term4216.getClass(), "peeked", -828982065);
        setLongField(term4216, term4216.getClass(), "peekedLong", 5127676408959197577L);
        setIntField(term4216, term4216.getClass(), "peekedNumberLength", 1221443226);
        setField(term4216, term4216.getClass(), "peekedString", "xtftXXMbem");
        setIntElement(term4293, 0, 908108726);
        setIntElement(term4293, 1, 1023209512);
        setIntElement(term4293, 2, 1084849225);
        setIntElement(term4293, 3, -1702055571);
        setIntElement(term4293, 4, -944542900);
        setIntElement(term4293, 5, 2063762142);
        setIntElement(term4293, 6, 1658391716);
        setIntElement(term4293, 7, 2143282300);
        setField(term4216, term4216.getClass(), "stack", term4293);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "skipValue", argTypes, term4216, args);
    }

};


