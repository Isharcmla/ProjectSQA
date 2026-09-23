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

public class DocumentType_outerHtmlHead_47202439965 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term46360;
     Object term46444;

    public DocumentType_outerHtmlHead_47202439965() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term46360 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        setField(term46360, term46360.getClass(), "attributes", null);
        Class<? extends Object> term47245 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term47244 = ((Class) term47245).getDeclaredField((String) "xml");
        ((Field) term47244).setAccessible(true);
        Object enum43 = ((Field) term47244).get((Object) null);
        term46444 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term46444, term46444.getClass(), "syntax", enum43);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.DocumentType");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.Appendable");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = null;
        args[1] = 0;
        args[2] = term46444;
        try {
            callMethod(klass, "outerHtmlHead", argTypes, term46360, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


