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

public class XmlTreeBuilder_insert_196792529291 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term219245;
     Object term219461;

    public XmlTreeBuilder_insert_196792529291() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term219335 = newInstance(Class.forName("java.lang.Object"));
        Object term219395 = newInstance(Class.forName("org.jsoup.nodes.FormElement"));
        ArrayList term219297 = new ArrayList();
        ((ArrayList) term219297).add((Object)null);
        ((ArrayList) term219297).add((Object)null);
        ((ArrayList) term219297).add((Object)null);
        ((ArrayList) term219297).add((Object)null);
        ((ArrayList) term219297).add(term219335);
        ((ArrayList) term219297).add((Object)null);
        ((ArrayList) term219297).add((Object)null);
        ((ArrayList) term219297).add((Object)null);
        ((ArrayList) term219297).add(term219395);
        term219245 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term219245, term219245.getClass(), "stack", term219297);
        char[] term218803 = (char[]) newCharArray(106);
        StringBuilder term219521 = new StringBuilder();
        ((StringBuilder) term219521).append(term218803);
        term219461 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term219461, term219461.getClass(), "data", term219521);
        setBooleanField(term219461, term219461.getClass(), "bogus", false);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term219461;
        try {
            callMethod(klass, "insert", argTypes, term219245, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


