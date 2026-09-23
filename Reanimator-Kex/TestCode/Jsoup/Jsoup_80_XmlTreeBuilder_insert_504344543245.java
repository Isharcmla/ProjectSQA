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
import java.lang.Object;
import java.lang.StringBuilder;

public class XmlTreeBuilder_insert_504344543245 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term303457;
     Object term303589;

    public XmlTreeBuilder_insert_504344543245() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term303457 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term303523 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term303523, term303523.getClass(), "preserveTagCase", false);
        setField(term303457, term303457.getClass(), "settings", term303523);
        StringBuilder term303649 = new StringBuilder();
        char[] term303088 = (char[]) newCharArray(1);
        StringBuilder term303709 = new StringBuilder();
        ((StringBuilder) term303709).append(term303088);
        term303589 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term303589, term303589.getClass(), "name", term303649);
        setField(term303589, term303589.getClass(), "publicIdentifier", term303709);
        setField(term303589, term303589.getClass(), "systemIdentifier", term303649);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term303589;
        try {
            callMethod(klass, "insert", argTypes, term303457, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


