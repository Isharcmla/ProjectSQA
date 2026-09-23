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
import java.lang.Object;
import java.util.LinkedHashMap;
import java.lang.String;

public class DocumentType_outerHtmlHead_47202439945 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term25738;
     Object term26044;

    public DocumentType_outerHtmlHead_47202439945() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term25856 = new LinkedHashMap();
        term25738 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        Object term25796 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term25796, term25796.getClass(), "attributes", term25856);
        setField(term25738, term25738.getClass(), "attributes", term25796);
        Class<? extends Object> term26920 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term26919 = ((Class) term26920).getDeclaredField((String) "html");
        ((Field) term26919).setAccessible(true);
        Object enum37 = ((Field) term26919).get((Object) null);
        term26044 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term26044, term26044.getClass(), "syntax", enum37);
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
        args[2] = term26044;
        try {
            callMethod(klass, "outerHtmlHead", argTypes, term25738, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


