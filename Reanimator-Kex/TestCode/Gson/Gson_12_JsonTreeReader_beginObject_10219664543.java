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

public class JsonTreeReader_beginObject_10219664543 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term510;

    public JsonTreeReader_beginObject_10219664543() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term510 = newInstance(Class.forName("com.google.gson.internal.bind.JsonTreeReader"));
        Object[] term511 = (Object[]) newArray("java.lang.Object", 3);
        Object term512 = newInstance(Class.forName("java.lang.Object"));
        Object term513 = newInstance(Class.forName("java.lang.Object"));
        Object term514 = newInstance(Class.forName("java.lang.Object"));
        Object[] term563 = (Object[]) newArray("java.lang.String", 6);
        int[] term636 = (int[]) newIntArray(2);
        char[] term531 = (char[]) newCharArray(2);
        int[] term553 = (int[]) newIntArray(8);
        setElement(term511, 0, term512);
        setElement(term511, 1, term513);
        setElement(term511, 2, term514);
        setField(term510, term510.getClass(), "stack", term511);
        setIntField(term510, term510.getClass(), "stackSize", 454281060);
        setElement(term563, 0, "flxyYxBRtu");
        setElement(term563, 1, "OclPbYPkcH");
        setElement(term563, 2, "IoAlmYsBwc");
        setElement(term563, 3, "TEParAifyi");
        setElement(term563, 4, "OWDIEULEFu");
        setElement(term563, 5, "dWRymuLBtr");
        setField(term510, term510.getClass(), "pathNames", term563);
        setIntElement(term636, 0, -1786399638);
        setIntElement(term636, 1, 2055867847);
        setField(term510, term510.getClass(), "pathIndices", term636);
        setField(term510, term510.getClass(), "in", null);
        setBooleanField(term510, term510.getClass(), "lenient", false);
        setCharElement(term531, 0, 's');
        setCharElement(term531, 1, 'j');
        setField(term510, term510.getClass(), "buffer", term531);
        setIntField(term510, term510.getClass(), "pos", -469968304);
        setIntField(term510, term510.getClass(), "limit", -1145578966);
        setIntField(term510, term510.getClass(), "lineNumber", 679763016);
        setIntField(term510, term510.getClass(), "lineStart", 1962444399);
        setIntField(term510, term510.getClass(), "peeked", 767834723);
        setLongField(term510, term510.getClass(), "peekedLong", -8257434502486459194L);
        setIntField(term510, term510.getClass(), "peekedNumberLength", -602026508);
        setField(term510, term510.getClass(), "peekedString", "vrQLuWIDJX");
        setIntElement(term553, 0, -157887805);
        setIntElement(term553, 1, 1876565163);
        setIntElement(term553, 2, -817164822);
        setIntElement(term553, 3, -1016503459);
        setIntElement(term553, 4, -1968847291);
        setIntElement(term553, 5, 579005622);
        setIntElement(term553, 6, -14890619);
        setIntElement(term553, 7, 1632125673);
        setField(term510, term510.getClass(), "stack", term553);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("com.google.gson.internal.bind.JsonTreeReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "beginObject", argTypes, term510, args);
    }

};


