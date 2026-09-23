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

public class XmlTreeBuilder_insert_504344543209 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term283895;
     Object term284027;

    public XmlTreeBuilder_insert_504344543209() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term283895 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term283961 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term283961, term283961.getClass(), "preserveTagCase", false);
        setField(term283895, term283895.getClass(), "settings", term283961);
        StringBuilder term284087 = new StringBuilder();
        StringBuilder term284147 = new StringBuilder();
        term284027 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term284027, term284027.getClass(), "name", term284087);
        setField(term284027, term284027.getClass(), "publicIdentifier", term284147);
        setField(term284027, term284027.getClass(), "systemIdentifier", term284087);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term284027;
        try {
            callMethod(klass, "insert", argTypes, term283895, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


