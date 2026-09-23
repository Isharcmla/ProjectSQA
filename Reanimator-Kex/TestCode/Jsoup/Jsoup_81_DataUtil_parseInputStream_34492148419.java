package org.jsoup.helper;

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
import static org.jsoup.helper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import static org.jsoup.helper.EqualityUtils.*;
import java.lang.Object;
import java.lang.String;

public class DataUtil_parseInputStream_34492148419 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term365;
     Object term55403;
     Object term54861;

    public DataUtil_parseInputStream_34492148419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term365 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term366 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term370 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term365, term365.getClass(), "treeBuilder", null);
        setIntField(term366, term366.getClass(), "maxSize", 0);
        setField(term366, term366.getClass(), "elementData", null);
        setIntField(term366, term366.getClass(), "size", 0);
        setIntField(term366, term366.getClass(), "modCount", 0);
        setField(term365, term365.getClass(), "errors", term366);
        setBooleanField(term370, term370.getClass(), "preserveTagCase", false);
        setBooleanField(term370, term370.getClass(), "preserveAttributeCase", false);
        setField(term365, term365.getClass(), "settings", term370);
        term55403 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term55404 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term55405 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term55403, term55403.getClass(), "treeBuilder", null);
        setIntField(term55404, term55404.getClass(), "maxSize", 0);
        setField(term55404, term55404.getClass(), "elementData", null);
        setIntField(term55404, term55404.getClass(), "size", 0);
        setIntField(term55404, term55404.getClass(), "modCount", 0);
        setField(term55403, term55403.getClass(), "errors", term55404);
        setBooleanField(term55405, term55405.getClass(), "preserveTagCase", false);
        setBooleanField(term55405, term55405.getClass(), "preserveAttributeCase", false);
        setField(term55403, term55403.getClass(), "settings", term55405);
        Class<? extends Object> term55447 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term55446 = ((Class) term55447).getDeclaredField((String) "extended");
        ((Field) term55446).setAccessible(true);
        Object enum9 = ((Field) term55446).get((Object) null);
        Class<? extends Object> term55658 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term55657 = ((Class) term55658).getDeclaredField((String) "html");
        ((Field) term55657).setAccessible(true);
        Object enum10 = ((Field) term55657).get((Object) null);
        Class<? extends Object> term55907 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term55906 = ((Class) term55907).getDeclaredField((String) "noQuirks");
        ((Field) term55906).setAccessible(true);
        Object enum11 = ((Field) term55906).get((Object) null);
        term54861 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term54862 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term55299 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term55307 = (Object[]) newArray("java.lang.String", 2);
        Object term55310 = newInstance(Class.forName("java.lang.ThreadLocal"));
        Object term55348 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term55364 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term54862, term54862.getClass(), "escapeMode", enum9);
        setField(term55299, term55299.getClass(), "name", "UTF-8");
        setElement(term55307, 0, "");
        setElement(term55307, 1, "");
        setField(term55299, term55299.getClass(), "aliases", term55307);
        setField(term55299, term55299.getClass(), "aliasSet", null);
        setField(term54862, term54862.getClass(), "charset", term55299);
        setIntField(term55310, term55310.getClass(), "threadLocalHashCode", -1936384785);
        setField(term54862, term54862.getClass(), "encoderThreadLocal", term55310);
        setField(term54862, term54862.getClass(), "coreCharset", null);
        setBooleanField(term54862, term54862.getClass(), "prettyPrint", true);
        setBooleanField(term54862, term54862.getClass(), "outline", false);
        setIntField(term54862, term54862.getClass(), "indentAmount", 1);
        setField(term54862, term54862.getClass(), "syntax", enum10);
        setField(term54861, term54861.getClass(), "outputSettings", term54862);
        setField(term54861, term54861.getClass(), "parser", null);
        setField(term54861, term54861.getClass(), "quirksMode", enum11);
        setField(term54861, term54861.getClass(), "location", "hRNSzYYIrc");
        setBooleanField(term54861, term54861.getClass(), "updateMetaCharset", false);
        setField(term55348, term55348.getClass(), "tagName", "#root");
        setBooleanField(term55348, term55348.getClass(), "isBlock", false);
        setBooleanField(term55348, term55348.getClass(), "formatAsBlock", true);
        setBooleanField(term55348, term55348.getClass(), "canContainInline", true);
        setBooleanField(term55348, term55348.getClass(), "empty", false);
        setBooleanField(term55348, term55348.getClass(), "selfClosing", false);
        setBooleanField(term55348, term55348.getClass(), "preserveWhitespace", false);
        setBooleanField(term55348, term55348.getClass(), "formList", false);
        setBooleanField(term55348, term55348.getClass(), "formSubmit", false);
        setField(term54861, term54861.getClass(), "tag", term55348);
        setField(term54861, term54861.getClass(), "shadowChildrenRef", null);
        setIntField(term55364, term55364.getClass(), "modCount", 0);
        setField(term54861, term54861.getClass(), "childNodes", term55364);
        setField(term54861, term54861.getClass(), "attributes", null);
        setField(term54861, term54861.getClass(), "baseUri", "hRNSzYYIrc");
        setField(term54861, term54861.getClass(), "parentNode", null);
        setIntField(term54861, term54861.getClass(), "siblingIndex", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.DataUtil");
        Class<?>[] argTypes = new Class<?>[4];
        argTypes[0] = Class.forName("java.io.InputStream");
        argTypes[1] = Class.forName("java.lang.String");
        argTypes[2] = Class.forName("java.lang.String");
        argTypes[3] = Class.forName("org.jsoup.parser.Parser");
        Object[] args = new Object[4];
        args[0] = null;
        args[1] = "MjGYSRKTNF";
        args[2] = "hRNSzYYIrc";
        args[3] = term365;
        Object retValue = callMethod(klass, "parseInputStream", argTypes, null, args);
        assertTrue(recursiveEquals(term365, term55403));
        assertTrue(recursiveEquals(retValue, term54861));
    }

};


