package org.jsoup.parser;

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
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CharacterReader_consumeToEnd_1419030637697 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3116192;

    public CharacterReader_consumeToEnd_1419030637697() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3116192 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object[] term3116091 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term3116192, term3116192.getClass(), "bufPos", -2147483648);
        setIntField(term3116192, term3116192.getClass(), "bufSplitPoint", -2147483647);
        setField(term3116192, term3116192.getClass(), "charBuf", null);
        setField(term3116192, term3116192.getClass(), "stringCache", term3116091);
        setIntField(term3116192, term3116192.getClass(), "bufLength", 13);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "consumeToEnd", argTypes, term3116192, args);
    }

};


