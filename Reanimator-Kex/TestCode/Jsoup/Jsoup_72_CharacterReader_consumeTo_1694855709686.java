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

public class CharacterReader_consumeTo_1694855709686 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term3112301;

    public CharacterReader_consumeTo_1694855709686() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term3112301 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        Object[] term3112187 = (Object[]) newArray("java.lang.String", 0);
        setIntField(term3112301, term3112301.getClass(), "bufPos", -2);
        setIntField(term3112301, term3112301.getClass(), "bufSplitPoint", -1);
        setIntField(term3112301, term3112301.getClass(), "bufLength", -2147483635);
        setField(term3112301, term3112301.getClass(), "charBuf", null);
        setField(term3112301, term3112301.getClass(), "stringCache", term3112187);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ";
        callMethod(klass, "consumeTo", argTypes, term3112301, args);
    }

};


