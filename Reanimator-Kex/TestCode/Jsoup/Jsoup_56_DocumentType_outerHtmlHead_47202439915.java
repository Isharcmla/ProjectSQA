package org.jsoup.nodes;

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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.String;
import java.lang.Object;

public class DocumentType_outerHtmlHead_47202439915 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6550;
     Object term6602;
     Object term6686;

    public DocumentType_outerHtmlHead_47202439915() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term6550 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        term6602 = newInstance(Class.forName("java.lang.StringBuilder"));
        Class<? extends Object> term7338 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term7337 = ((Class) term7338).getDeclaredField((String) "xml");
        ((Field) term7337).setAccessible(true);
        Object enum13 = ((Field) term7337).get((Object) null);
        term6686 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term6686, term6686.getClass(), "syntax", enum13);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.DocumentType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term6602;
        args[1] = 0;
        args[2] = term6686;
        try {
            callMethod(klass, "outerHtmlHead", argTypes, term6550, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


