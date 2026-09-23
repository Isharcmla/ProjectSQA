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

public class XmlTreeBuilder_insert_504344543159 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283404;
     Object term283536;

    public XmlTreeBuilder_insert_504344543159() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term283404 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term283470 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term283470, term283470.getClass(), "preserveTagCase", true);
        setField(term283404, term283404.getClass(), "settings", term283470);
        char[] term283167 = (char[]) newCharArray(0);
        StringBuilder term283596 = new StringBuilder();
        ((StringBuilder) term283596).append(term283167);
        StringBuilder term283656 = new StringBuilder();
        StringBuilder term283716 = new StringBuilder();
        term283536 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term283536, term283536.getClass(), "name", term283596);
        setField(term283536, term283536.getClass(), "publicIdentifier", term283656);
        setField(term283536, term283536.getClass(), "systemIdentifier", term283716);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term283536;
        try {
            callMethod(klass, "insert", argTypes, term283404, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


