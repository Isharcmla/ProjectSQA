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
import java.util.ArrayList;
import java.lang.Object;

public class XmlTreeBuilder_insert_420854838199 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term331169;
     Object term331375;

    public XmlTreeBuilder_insert_420854838199() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Object term331259 = newInstance(Class.forName("java.lang.Object"));
        Object term331313 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        ArrayList term331221 = new ArrayList();
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331259);
        ((ArrayList) term331221).add(term331313);
        term331169 = newInstance(Class.forName("org.jsoup.parser.XmlTreeBuilder"));
        setField(term331169, term331169.getClass(), "stack", term331221);
        term331375 = newInstance(Class.forName("org.jsoup.parser.Token$CData"));
        setField(term331375, term331375.getClass(), "data", null);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.parser.XmlTreeBuilder");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("org.jsoup.parser.Token$Character");
        Object[] args = new Object[1];
        args[0] = term331375;
        try {
            callMethod(klass, "insert", argTypes, term331169, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


