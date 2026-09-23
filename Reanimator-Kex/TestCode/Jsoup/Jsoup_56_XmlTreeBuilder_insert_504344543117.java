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

public class XmlTreeBuilder_insert_504344543117 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term136532;
     Object term136664;

    public XmlTreeBuilder_insert_504344543117() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term136532 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term136598 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term136598, term136598.getClass(), "preserveTagCase", false);
        setField(term136532, term136532.getClass(), "settings", term136598);
        char[] term135492 = (char[]) newCharArray(108);
        StringBuilder term136724 = new StringBuilder();
        ((StringBuilder) term136724).append(term135492);
        term136664 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term136664, term136664.getClass(), "name", term136724);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term136664;
        try {
            callMethod(klass, "insert", argTypes, term136532, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


