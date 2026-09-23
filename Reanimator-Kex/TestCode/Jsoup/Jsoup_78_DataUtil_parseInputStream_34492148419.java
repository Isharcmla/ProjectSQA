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
     Object term366;
     Object term55393;
     Object term54850;

    public DataUtil_parseInputStream_34492148419() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        term366 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term368 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term372 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term366, term366.getClass(), "treeBuilder", null);
        setIntField(term366, term366.getClass(), "maxErrors", -1922583790);
        setIntField(term368, term368.getClass(), "maxSize", 0);
        setField(term368, term368.getClass(), "elementData", null);
        setIntField(term368, term368.getClass(), "size", 0);
        setIntField(term368, term368.getClass(), "modCount", 0);
        setField(term366, term366.getClass(), "errors", term368);
        setBooleanField(term372, term372.getClass(), "preserveTagCase", false);
        setBooleanField(term372, term372.getClass(), "preserveAttributeCase", false);
        setField(term366, term366.getClass(), "settings", term372);
        term55393 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term55394 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term55395 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term55393, term55393.getClass(), "treeBuilder", null);
        setIntField(term55393, term55393.getClass(), "maxErrors", -1922583790);
        setIntField(term55394, term55394.getClass(), "maxSize", 0);
        setField(term55394, term55394.getClass(), "elementData", null);
        setIntField(term55394, term55394.getClass(), "size", 0);
        setIntField(term55394, term55394.getClass(), "modCount", 0);
        setField(term55393, term55393.getClass(), "errors", term55394);
        setBooleanField(term55395, term55395.getClass(), "preserveTagCase", false);
        setBooleanField(term55395, term55395.getClass(), "preserveAttributeCase", false);
        setField(term55393, term55393.getClass(), "settings", term55395);
        Class<? extends Object> term55437 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term55436 = ((Class) term55437).getDeclaredField((String) "extended");
        ((Field) term55436).setAccessible(true);
        Object enum9 = ((Field) term55436).get((Object) null);
        Class<? extends Object> term55648 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term55647 = ((Class) term55648).getDeclaredField((String) "html");
        ((Field) term55647).setAccessible(true);
        Object enum10 = ((Field) term55647).get((Object) null);
        Class<? extends Object> term55897 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term55896 = ((Class) term55897).getDeclaredField((String) "noQuirks");
        ((Field) term55896).setAccessible(true);
        Object enum11 = ((Field) term55896).get((Object) null);
        term54850 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term54851 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term55288 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term55296 = (Object[]) newArray("java.lang.String", 2);
        Object term55299 = newInstance(Class.forName("java.lang.ThreadLocal"));
        Object term55337 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term55353 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term54851, term54851.getClass(), "escapeMode", enum9);
        setField(term55288, term55288.getClass(), "name", "UTF-8");
        setElement(term55296, 0, "");
        setElement(term55296, 1, "");
        setField(term55288, term55288.getClass(), "aliases", term55296);
        setField(term55288, term55288.getClass(), "aliasSet", null);
        setField(term54851, term54851.getClass(), "charset", term55288);
        setIntField(term55299, term55299.getClass(), "threadLocalHashCode", -1936384785);
        setField(term54851, term54851.getClass(), "encoderThreadLocal", term55299);
        setField(term54851, term54851.getClass(), "coreCharset", null);
        setBooleanField(term54851, term54851.getClass(), "prettyPrint", true);
        setBooleanField(term54851, term54851.getClass(), "outline", false);
        setIntField(term54851, term54851.getClass(), "indentAmount", 1);
        setField(term54851, term54851.getClass(), "syntax", enum10);
        setField(term54850, term54850.getClass(), "outputSettings", term54851);
        setField(term54850, term54850.getClass(), "quirksMode", enum11);
        setField(term54850, term54850.getClass(), "location", "hRNSzYYIrc");
        setBooleanField(term54850, term54850.getClass(), "updateMetaCharset", false);
        setField(term55337, term55337.getClass(), "tagName", "#root");
        setBooleanField(term55337, term55337.getClass(), "isBlock", false);
        setBooleanField(term55337, term55337.getClass(), "formatAsBlock", true);
        setBooleanField(term55337, term55337.getClass(), "canContainInline", true);
        setBooleanField(term55337, term55337.getClass(), "empty", false);
        setBooleanField(term55337, term55337.getClass(), "selfClosing", false);
        setBooleanField(term55337, term55337.getClass(), "preserveWhitespace", false);
        setBooleanField(term55337, term55337.getClass(), "formList", false);
        setBooleanField(term55337, term55337.getClass(), "formSubmit", false);
        setField(term54850, term54850.getClass(), "tag", term55337);
        setField(term54850, term54850.getClass(), "shadowChildrenRef", null);
        setIntField(term55353, term55353.getClass(), "modCount", 0);
        setField(term54850, term54850.getClass(), "childNodes", term55353);
        setField(term54850, term54850.getClass(), "attributes", null);
        setField(term54850, term54850.getClass(), "baseUri", "hRNSzYYIrc");
        setField(term54850, term54850.getClass(), "parentNode", null);
        setIntField(term54850, term54850.getClass(), "siblingIndex", 0);
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
        args[3] = term366;
        Object retValue = callMethod(klass, "parseInputStream", argTypes, null, args);
        assertTrue(recursiveEquals(term366, term55393));
        assertTrue(recursiveEquals(retValue, term54850));
    }

};


