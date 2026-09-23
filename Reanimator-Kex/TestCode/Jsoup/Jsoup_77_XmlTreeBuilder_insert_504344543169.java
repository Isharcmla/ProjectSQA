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

public class XmlTreeBuilder_insert_504344543169 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term289523;
     Object term289655;

    public XmlTreeBuilder_insert_504344543169() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term289523 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term289589 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term289589, term289589.getClass(), "preserveTagCase", true);
        setField(term289523, term289523.getClass(), "settings", term289589);
        StringBuilder term289715 = new StringBuilder();
        char[] term289171 = (char[]) newCharArray(4);
        StringBuilder term289775 = new StringBuilder();
        ((StringBuilder) term289775).append(term289171);
        StringBuilder term289835 = new StringBuilder();
        term289655 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term289655, term289655.getClass(), "name", term289715);
        setField(term289655, term289655.getClass(), "publicIdentifier", term289775);
        setField(term289655, term289655.getClass(), "systemIdentifier", term289835);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term289655;
        try {
            callMethod(klass, "insert", argTypes, term289523, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


