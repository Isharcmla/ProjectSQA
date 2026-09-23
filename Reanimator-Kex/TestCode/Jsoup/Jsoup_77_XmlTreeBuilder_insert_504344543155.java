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

public class XmlTreeBuilder_insert_504344543155 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term280090;
     Object term280222;

    public XmlTreeBuilder_insert_504344543155() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term280090 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term280156 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term280156, term280156.getClass(), "preserveTagCase", true);
        setField(term280090, term280090.getClass(), "settings", term280156);
        StringBuilder term280282 = new StringBuilder();
        StringBuilder term280342 = new StringBuilder();
        StringBuilder term280402 = new StringBuilder();
        term280222 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term280222, term280222.getClass(), "name", term280282);
        setField(term280222, term280222.getClass(), "publicIdentifier", term280342);
        setField(term280222, term280222.getClass(), "systemIdentifier", term280402);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term280222;
        try {
            callMethod(klass, "insert", argTypes, term280090, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


