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

public class XmlTreeBuilder_insert_504344543265 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term420776;
     Object term420908;

    public XmlTreeBuilder_insert_504344543265() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term420776 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        Object term420842 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setBooleanField(term420842, term420842.getClass(), "preserveTagCase", true);
        setField(term420776, term420776.getClass(), "settings", term420842);
        char[] term420370 = (char[]) newCharArray(0);
        StringBuilder term420968 = new StringBuilder();
        ((StringBuilder) term420968).append(term420370);
        StringBuilder term421028 = new StringBuilder();
        StringBuilder term421088 = new StringBuilder();
        term420908 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term420908, term420908.getClass(), "name", term420968);
        setField(term420908, term420908.getClass(), "publicIdentifier", term421028);
        setField(term420908, term420908.getClass(), "systemIdentifier", term421088);
        setField(term420908, term420908.getClass(), "pubSysKey", "systemId");
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term420908;
        try {
            callMethod(klass, "insert", argTypes, term420776, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


