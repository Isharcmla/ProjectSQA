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
import java.lang.StringBuilder;

public class XmlTreeBuilder_insert_504344543119 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term95930;
     Object term95996;

    public XmlTreeBuilder_insert_504344543119() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term95930 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        char[] term95119 = (char[]) newCharArray(234);
        StringBuilder term96056 = new StringBuilder();
        ((StringBuilder) term96056).append(term95119);
        char[] term95825 = (char[]) newCharArray(1);
        StringBuilder term96116 = new StringBuilder();
        ((StringBuilder) term96116).append(term95825);
        term95996 = newInstance(Class.forName("org.jsoup.parser.Token$Doctype"));
        setField(term95996, term95996.getClass(), "name", term96056);
        setField(term95996, term95996.getClass(), "publicIdentifier", term96116);
        setField(term95996, term95996.getClass(), "systemIdentifier", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Doctype");
        Object[] args = new Object[1];
        args[0] = term95996;
        try {
            callMethod(klass, "insert", argTypes, term95930, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


