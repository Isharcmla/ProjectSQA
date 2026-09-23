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
import java.lang.StringBuilder;

public class XmlTreeBuilder_insert_1967925292133 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term244575;
     Object term244803;

    public XmlTreeBuilder_insert_1967925292133() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term244665 = newInstance(Class.forName("java.lang.Object"));
        Object term244737 = newInstance(Class.forName("org.jsoup.nodes.PseudoTextElement"));
        setField(term244737, term244737.getClass(), "childNodes", null);
        ArrayList term244627 = new ArrayList();
        ((ArrayList) term244627).add((Object)null);
        ((ArrayList) term244627).add((Object)null);
        ((ArrayList) term244627).add(term244665);
        ((ArrayList) term244627).add(term244737);
        term244575 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term244575, term244575.getClass(), "stack", term244627);
        char[] term244410 = (char[]) newCharArray(0);
        StringBuilder term244863 = new StringBuilder();
        ((StringBuilder) term244863).append(term244410);
        term244803 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term244803, term244803.getClass(), "data", term244863);
        setBooleanField(term244803, term244803.getClass(), "bogus", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term244803;
        try {
            callMethod(klass, "insert", argTypes, term244575, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


