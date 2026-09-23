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
import java.lang.StringIndexOutOfBoundsException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;

public class CharacterReader_toString_109161529174 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4105;

    public CharacterReader_toString_109161529174() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term4105 = newInstance(Class.forName("org.jsoup.parser.CharacterReader"));
        char[] term4106 = (char[]) newCharArray(5);
        Object[] term4117 = (Object[]) newArray("java.lang.String", 1);
        setCharElement(term4106, 0, 'i');
        setCharElement(term4106, 1, 'a');
        setCharElement(term4106, 2, 'G');
        setCharElement(term4106, 3, 'I');
        setCharElement(term4106, 4, 'b');
        setField(term4105, term4105.getClass(), "charBuf", term4106);
        setField(term4105, term4105.getClass(), "reader", null);
        setIntField(term4105, term4105.getClass(), "bufLength", -523949691);
        setIntField(term4105, term4105.getClass(), "bufSplitPoint", 1398204340);
        setIntField(term4105, term4105.getClass(), "bufPos", 229204365);
        setIntField(term4105, term4105.getClass(), "readerPos", -461771056);
        setIntField(term4105, term4105.getClass(), "bufMark", -243422082);
        setElement(term4117, 0, "VeDtgDzGAN");
        setField(term4105, term4105.getClass(), "stringCache", term4117);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.CharacterReader");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        try {
            callMethod(klass, "toString", argTypes, term4105, args);
            assertTrue(false);
        }
        catch (StringIndexOutOfBoundsException e) {
        }

    }

};


