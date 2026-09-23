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

public class DataUtil_parseInputStream_34492148417 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term365;
     Object term55225;
     Object term54683;

    public DataUtil_parseInputStream_34492148417() {
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
        term55225 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term55226 = newInstance(Class.forName("org.jsoup.parser.ParseErrorList"));
        Object term55227 = newInstance(Class.forName("org.jsoup.parser.ParseSettings"));
        setField(term55225, term55225.getClass(), "treeBuilder", null);
        setIntField(term55226, term55226.getClass(), "maxSize", 0);
        setField(term55226, term55226.getClass(), "elementData", null);
        setIntField(term55226, term55226.getClass(), "size", 0);
        setIntField(term55226, term55226.getClass(), "modCount", 0);
        setField(term55225, term55225.getClass(), "errors", term55226);
        setBooleanField(term55227, term55227.getClass(), "preserveTagCase", false);
        setBooleanField(term55227, term55227.getClass(), "preserveAttributeCase", false);
        setField(term55225, term55225.getClass(), "settings", term55227);
        Class<? extends Object> term55269 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term55268 = ((Class) term55269).getDeclaredField((String) "extended");
        ((Field) term55268).setAccessible(true);
        Object enum8 = ((Field) term55268).get((Object) null);
        Class<? extends Object> term55480 = Class.forName((String) "org.jsoup.nodes.Document$OutputSettings$Syntax");
        Field term55479 = ((Class) term55480).getDeclaredField((String) "html");
        ((Field) term55479).setAccessible(true);
        Object enum9 = ((Field) term55479).get((Object) null);
        Class<? extends Object> term55729 = Class.forName((String) "org.jsoup.nodes.Document$QuirksMode");
        Field term55728 = ((Class) term55729).getDeclaredField((String) "noQuirks");
        ((Field) term55728).setAccessible(true);
        Object enum10 = ((Field) term55728).get((Object) null);
        term54683 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term54684 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term55121 = newInstance(Class.forName("sun.nio.cs.UTF_8"));
        Object[] term55129 = (Object[]) newArray("java.lang.String", 2);
        Object term55132 = newInstance(Class.forName("java.lang.ThreadLocal"));
        Object term55170 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term55186 = newInstance(Class.forName("java.util.Collections$EmptyList"));
        setField(term54684, term54684.getClass(), "escapeMode", enum8);
        setField(term55121, term55121.getClass(), "name", "UTF-8");
        setElement(term55129, 0, "");
        setElement(term55129, 1, "");
        setField(term55121, term55121.getClass(), "aliases", term55129);
        setField(term55121, term55121.getClass(), "aliasSet", null);
        setField(term54684, term54684.getClass(), "charset", term55121);
        setIntField(term55132, term55132.getClass(), "threadLocalHashCode", -1936384785);
        setField(term54684, term54684.getClass(), "encoderThreadLocal", term55132);
        setField(term54684, term54684.getClass(), "coreCharset", null);
        setBooleanField(term54684, term54684.getClass(), "prettyPrint", true);
        setBooleanField(term54684, term54684.getClass(), "outline", false);
        setIntField(term54684, term54684.getClass(), "indentAmount", 1);
        setField(term54684, term54684.getClass(), "syntax", enum9);
        setField(term54683, term54683.getClass(), "outputSettings", term54684);
        setField(term54683, term54683.getClass(), "parser", null);
        setField(term54683, term54683.getClass(), "quirksMode", enum10);
        setField(term54683, term54683.getClass(), "location", "hRNSzYYIrc");
        setBooleanField(term54683, term54683.getClass(), "updateMetaCharset", false);
        setField(term55170, term55170.getClass(), "tagName", "#root");
        setBooleanField(term55170, term55170.getClass(), "isBlock", false);
        setBooleanField(term55170, term55170.getClass(), "formatAsBlock", true);
        setBooleanField(term55170, term55170.getClass(), "canContainInline", true);
        setBooleanField(term55170, term55170.getClass(), "empty", false);
        setBooleanField(term55170, term55170.getClass(), "selfClosing", false);
        setBooleanField(term55170, term55170.getClass(), "preserveWhitespace", false);
        setBooleanField(term55170, term55170.getClass(), "formList", false);
        setBooleanField(term55170, term55170.getClass(), "formSubmit", false);
        setField(term54683, term54683.getClass(), "tag", term55170);
        setField(term54683, term54683.getClass(), "shadowChildrenRef", null);
        setIntField(term55186, term55186.getClass(), "modCount", 0);
        setField(term54683, term54683.getClass(), "childNodes", term55186);
        setField(term54683, term54683.getClass(), "attributes", null);
        setField(term54683, term54683.getClass(), "baseUri", "hRNSzYYIrc");
        setField(term54683, term54683.getClass(), "parentNode", null);
        setIntField(term54683, term54683.getClass(), "siblingIndex", 0);
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
        assertTrue(recursiveEquals(term365, term55225));
        assertTrue(recursiveEquals(retValue, term54683));
    }

};


