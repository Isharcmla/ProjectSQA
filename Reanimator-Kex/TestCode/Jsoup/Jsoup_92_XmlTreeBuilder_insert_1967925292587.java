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
import java.lang.ClassCastException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;
import java.lang.StringBuilder;

public class XmlTreeBuilder_insert_1967925292587 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term445588;
     Object term445706;

    public XmlTreeBuilder_insert_1967925292587() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        byte[] term445468 = (byte[]) newByteArray(0);
        ArrayList term445640 = new ArrayList();
        ((ArrayList) term445640).add((Object)null);
        ((ArrayList) term445640).add((Object)null);
        ((ArrayList) term445640).add((Object)null);
        ((ArrayList) term445640).add((Object)null);
        ((ArrayList) term445640).add((Object)null);
        ((ArrayList) term445640).add((Object)null);
        ((ArrayList) term445640).add((Object)null);
        ((ArrayList) term445640).add(term445468);
        term445588 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term445588, term445588.getClass(), "stack", term445640);
        char[] term445436 = (char[]) newCharArray(10);
        setCharElement(term445436, 1, (char) 16);
        setCharElement(term445436, 2, (char) 16);
        setCharElement(term445436, 3, (char) 16);
        setCharElement(term445436, 4, (char) 16);
        setCharElement(term445436, 5, (char) 16);
        setCharElement(term445436, 6, (char) 16);
        setCharElement(term445436, 7, (char) 16);
        setCharElement(term445436, 8, (char) 16);
        setCharElement(term445436, 9, (char) 16);
        StringBuilder term445766 = new StringBuilder();
        ((StringBuilder) term445766).append(term445436);
        term445706 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term445706, term445706.getClass(), "data", term445766);
        setBooleanField(term445706, term445706.getClass(), "bogus", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term445706;
        try {
            callMethod(klass, "insert", argTypes, term445588, args);
            assertTrue(false);
        }
        catch (ClassCastException e) {
        }

    }

};


