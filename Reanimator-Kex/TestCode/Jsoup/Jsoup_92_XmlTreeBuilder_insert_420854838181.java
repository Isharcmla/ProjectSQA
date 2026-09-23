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
import java.lang.NullPointerException;
import static org.jsoup.parser.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.util.ArrayList;
import java.lang.Object;

public class XmlTreeBuilder_insert_420854838181 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term263536;
     Object term263760;

    public XmlTreeBuilder_insert_420854838181() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term263626 = newInstance(Class.forName("java.lang.Object"));
        Object term263698 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        ArrayList term263588 = new ArrayList();
        ((ArrayList) term263588).add(term263626);
        ((ArrayList) term263588).add(term263626);
        ((ArrayList) term263588).add(term263626);
        ((ArrayList) term263588).add(term263626);
        ((ArrayList) term263588).add(term263626);
        ((ArrayList) term263588).add(term263626);
        ((ArrayList) term263588).add(term263626);
        ((ArrayList) term263588).add(term263626);
        ((ArrayList) term263588).add(term263626);
        ((ArrayList) term263588).add(term263626);
        ((ArrayList) term263588).add(term263626);
        ((ArrayList) term263588).add(term263626);
        ((ArrayList) term263588).add(term263626);
        ((ArrayList) term263588).add(term263626);
        ((ArrayList) term263588).add(term263626);
        ((ArrayList) term263588).add(term263698);
        term263536 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term263536, term263536.getClass(), "stack", term263588);
        term263760 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term263760, term263760.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term263760;
        try {
            callMethod(klass, "insert", argTypes, term263536, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


