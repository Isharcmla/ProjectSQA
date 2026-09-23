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

public class JsonTreeReader_hasNext_2166003135 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term1011;

    public JsonTreeReader_hasNext_2166003135() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term1011 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term1012 = (Object[]) newArray("java.lang.Object", 7);
        Object term1013 = newInstance(Class.forName("java.lang.Object"));
        Object term1014 = newInstance(Class.forName("java.lang.Object"));
        Object term1015 = newInstance(Class.forName("java.lang.Object"));
        Object term1016 = newInstance(Class.forName("java.lang.Object"));
        Object term1017 = newInstance(Class.forName("java.lang.Object"));
        Object term1018 = newInstance(Class.forName("java.lang.Object"));
        Object term1019 = newInstance(Class.forName("java.lang.Object"));
        Object[] term1084 = (Object[]) newArray("java.lang.String", 5);
        int[] term1145 = (int[]) newIntArray(3);
        char[] term1054 = (char[]) newCharArray(6);
        int[] term1080 = (int[]) newIntArray(2);
        setElement(term1012, 0, term1013);
        setElement(term1012, 1, term1014);
        setElement(term1012, 2, term1015);
        setElement(term1012, 3, term1016);
        setElement(term1012, 4, term1017);
        setElement(term1012, 5, term1018);
        setElement(term1012, 6, term1019);
        setField(term1011, term1011.getClass(), "stack", term1012);
        setIntField(term1011, term1011.getClass(), "stackSize", -344842608);
        setElement(term1084, 0, "nGKItKLYNC");
        setElement(term1084, 1, "UiUYnPrcCi");
        setElement(term1084, 2, "UoYtihxVaS");
        setElement(term1084, 3, "JDswTTCZHV");
        setElement(term1084, 4, "onpbIeEKoi");
        setField(term1011, term1011.getClass(), "pathNames", term1084);
        setIntElement(term1145, 0, 941650513);
        setIntElement(term1145, 1, 444029505);
        setIntElement(term1145, 2, -1034506028);
        setField(term1011, term1011.getClass(), "pathIndices", term1145);
        setField(term1011, term1011.getClass(), "in", null);
        setBooleanField(term1011, term1011.getClass(), "lenient", true);
        setCharElement(term1054, 0, 'R');
        setCharElement(term1054, 1, 'r');
        setCharElement(term1054, 2, 'b');
        setCharElement(term1054, 3, 'M');
        setCharElement(term1054, 4, 'u');
        setCharElement(term1054, 5, 'L');
        setField(term1011, term1011.getClass(), "buffer", term1054);
        setIntField(term1011, term1011.getClass(), "pos", 1090617576);
        setIntField(term1011, term1011.getClass(), "limit", -1547384488);
        setIntField(term1011, term1011.getClass(), "lineNumber", 1442160736);
        setIntField(term1011, term1011.getClass(), "lineStart", 1114000454);
        setIntField(term1011, term1011.getClass(), "peeked", -556405712);
        setLongField(term1011, term1011.getClass(), "peekedLong", 5270370404989704783L);
        setIntField(term1011, term1011.getClass(), "peekedNumberLength", -1772434990);
        setField(term1011, term1011.getClass(), "peekedString", "jDtqGUpnZN");
        setIntElement(term1080, 0, -1845499264);
        setIntElement(term1080, 1, -505439934);
        setField(term1011, term1011.getClass(), "stack", term1080);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "hasNext", argTypes, term1011, args);
    }

};


