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

public class DocumentType_outerHtmlHead_47202439929 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term13011;
     Object term13317;

    public DocumentType_outerHtmlHead_47202439929() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        LinkedHashMap term13129 = new LinkedHashMap();
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        ((LinkedHashMap) term13129).put((Object)null, (Object)null);
        term13011 = newInstance(Class.forName("org.jsoup.nodes.DocumentType"));
        Object term13069 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term13069, term13069.getClass(), "attributes", term13129);
        setField(term13011, term13011.getClass(), "attributes", term13069);
        Class<? extends Object> term14385 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term14384 = ((Class) term14385).getDeclaredField((String) "xml");
        ((Field) term14384).setAccessible(true);
        Object enum22 = ((Field) term14384).get((Object) null);
        term13317 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term13317, term13317.getClass(), "syntax", enum22);
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
        args[2] = term13317;
        try {
            callMethod(klass, "outerHtmlHead", argTypes, term13011, args);
            assertTrue(false);
        }
        catch (NullPointerException e) {
        }

    }

};


