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
import java.util.ArrayList;
import java.lang.StringBuilder;

public class XmlTreeBuilder_insert_504344543211 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term285466;
     Object term285650;

    public XmlTreeBuilder_insert_504344543211() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term285584 = new ArrayList();
        term285466 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term285532 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term285532, term285532.getClass(), "preserveTagCase", false);
        setField(term285466, term285466.getClass(), "settings", term285532);
        setField(term285466, term285466.getClass(), "stack", term285584);
        StringBuilder term285710 = new StringBuilder();
        char[] term285063 = (char[]) newCharArray(0);
        StringBuilder term285770 = new StringBuilder();
        ((StringBuilder) term285770).append(term285063);
        term285650 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term285650, term285650.getClass(), "name", term285710);
        setField(term285650, term285650.getClass(), "publicIdentifier", term285710);
        setField(term285650, term285650.getClass(), "systemIdentifier", term285770);
        setField(term285650, term285650.getClass(), "pubSysKey", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term285650;
        try {
            callMethod(klass, "insert", argTypes, term285466, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


