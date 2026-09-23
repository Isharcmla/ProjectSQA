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

public class XmlTreeBuilder_insert_196792529269 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term203239;
     Object term203357;

    public XmlTreeBuilder_insert_196792529269() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term203291 = new ArrayList();
        ((ArrayList) term203291).add((Object)null);
        term203239 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term203239, term203239.getClass(), "stack", term203291);
        char[] term203058 = (char[]) newCharArray(2);
        setCharElement(term203058, 0, (char) 16);
        setCharElement(term203058, 1, 'm');
        StringBuilder term203417 = new StringBuilder();
        ((StringBuilder) term203417).append(term203058);
        term203357 = newInstance(Class.forName("org.jsoup.parser.Token$Comment"));
        setField(term203357, term203357.getClass(), "data", term203417);
        setBooleanField(term203357, term203357.getClass(), "bogus", true);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Comment");
        Object[] args = new Object[1];
        args[0] = term203357;
        try {
            callMethod(klass, "insert", argTypes, term203239, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


