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

public class XmlTreeBuilder_insert_504344543279 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term324525;
     Object term324657;

    public XmlTreeBuilder_insert_504344543279() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term324525 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term324591 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term324591, term324591.getClass(), "preserveTagCase", false);
        setField(term324525, term324525.getClass(), "settings", term324591);
        StringBuilder term324717 = new StringBuilder();
        char[] term324352 = (char[]) newCharArray(1);
        setCharElement(term324352, 0, (char) 1);
        StringBuilder term324777 = new StringBuilder();
        ((StringBuilder) term324777).append(term324352);
        StringBuilder term324837 = new StringBuilder();
        term324657 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term324657, term324657.getClass(), "name", term324717);
        setField(term324657, term324657.getClass(), "publicIdentifier", term324777);
        setField(term324657, term324657.getClass(), "systemIdentifier", term324837);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term324657;
        try {
            callMethod(klass, "insert", argTypes, term324525, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


