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
import static org.jsoup.nodes.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;

public class Document_createElement_7569080177 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8870;

    public Document_createElement_7569080177() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        Class<? extends Object> term9044 = Class.forName((String) "org.jsoup.nodes.Entities$EscapeMode");
        Field term9043 = ((Class) term9044).getDeclaredField((String) "xhtml");
        ((Field) term9043).setAccessible(true);
        Object enum4 = ((Field) term9043).get((Object) null);
        Object term8912 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8912, term8912.getClass(), "tagName", null);
        setBooleanField(term8912, term8912.getClass(), "knownTag", false);
        setBooleanField(term8912, term8912.getClass(), "isBlock", true);
        setBooleanField(term8912, term8912.getClass(), "canContainBlock", true);
        setBooleanField(term8912, term8912.getClass(), "canContainInline", false);
        setBooleanField(term8912, term8912.getClass(), "optionalClosing", false);
        setBooleanField(term8912, term8912.getClass(), "empty", false);
        setBooleanField(term8912, term8912.getClass(), "selfClosing", false);
        setBooleanField(term8912, term8912.getClass(), "preserveWhitespace", true);
        setField(term8912, term8912.getClass(), "ancestors", null);
        setField(term8912, term8912.getClass(), "excludes", null);
        setField(term8912, term8912.getClass(), "ignoreEndTags", null);
        setBooleanField(term8912, term8912.getClass(), "directDescendant", false);
        setBooleanField(term8912, term8912.getClass(), "limitChildren", true);
        Object term8923 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8923, term8923.getClass(), "tagName", null);
        setBooleanField(term8923, term8923.getClass(), "knownTag", false);
        setBooleanField(term8923, term8923.getClass(), "isBlock", false);
        setBooleanField(term8923, term8923.getClass(), "canContainBlock", false);
        setBooleanField(term8923, term8923.getClass(), "canContainInline", false);
        setBooleanField(term8923, term8923.getClass(), "optionalClosing", false);
        setBooleanField(term8923, term8923.getClass(), "empty", false);
        setBooleanField(term8923, term8923.getClass(), "selfClosing", false);
        setBooleanField(term8923, term8923.getClass(), "preserveWhitespace", false);
        setField(term8923, term8923.getClass(), "ancestors", null);
        setField(term8923, term8923.getClass(), "excludes", null);
        setField(term8923, term8923.getClass(), "ignoreEndTags", null);
        setBooleanField(term8923, term8923.getClass(), "directDescendant", false);
        setBooleanField(term8923, term8923.getClass(), "limitChildren", false);
        ArrayList term8910 = new ArrayList();
        ((ArrayList) term8910).add(term8912);
        ((ArrayList) term8910).add(term8923);
        ((ArrayList) term8910).add(term8912);
        Object term8938 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8938, term8938.getClass(), "tagName", null);
        setBooleanField(term8938, term8938.getClass(), "knownTag", true);
        setBooleanField(term8938, term8938.getClass(), "isBlock", true);
        setBooleanField(term8938, term8938.getClass(), "canContainBlock", true);
        setBooleanField(term8938, term8938.getClass(), "canContainInline", true);
        setBooleanField(term8938, term8938.getClass(), "optionalClosing", false);
        setBooleanField(term8938, term8938.getClass(), "empty", true);
        setBooleanField(term8938, term8938.getClass(), "selfClosing", false);
        setBooleanField(term8938, term8938.getClass(), "preserveWhitespace", true);
        setField(term8938, term8938.getClass(), "ancestors", null);
        setField(term8938, term8938.getClass(), "excludes", null);
        setField(term8938, term8938.getClass(), "ignoreEndTags", null);
        setBooleanField(term8938, term8938.getClass(), "directDescendant", true);
        setBooleanField(term8938, term8938.getClass(), "limitChildren", true);
        Object term8949 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8949, term8949.getClass(), "tagName", null);
        setBooleanField(term8949, term8949.getClass(), "knownTag", false);
        setBooleanField(term8949, term8949.getClass(), "isBlock", false);
        setBooleanField(term8949, term8949.getClass(), "canContainBlock", false);
        setBooleanField(term8949, term8949.getClass(), "canContainInline", false);
        setBooleanField(term8949, term8949.getClass(), "optionalClosing", false);
        setBooleanField(term8949, term8949.getClass(), "empty", false);
        setBooleanField(term8949, term8949.getClass(), "selfClosing", false);
        setBooleanField(term8949, term8949.getClass(), "preserveWhitespace", false);
        setField(term8949, term8949.getClass(), "ancestors", null);
        setField(term8949, term8949.getClass(), "excludes", null);
        setField(term8949, term8949.getClass(), "ignoreEndTags", null);
        setBooleanField(term8949, term8949.getClass(), "directDescendant", false);
        setBooleanField(term8949, term8949.getClass(), "limitChildren", false);
        Object term8960 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8960, term8960.getClass(), "tagName", null);
        setBooleanField(term8960, term8960.getClass(), "knownTag", false);
        setBooleanField(term8960, term8960.getClass(), "isBlock", false);
        setBooleanField(term8960, term8960.getClass(), "canContainBlock", true);
        setBooleanField(term8960, term8960.getClass(), "canContainInline", false);
        setBooleanField(term8960, term8960.getClass(), "optionalClosing", true);
        setBooleanField(term8960, term8960.getClass(), "empty", true);
        setBooleanField(term8960, term8960.getClass(), "selfClosing", false);
        setBooleanField(term8960, term8960.getClass(), "preserveWhitespace", false);
        setField(term8960, term8960.getClass(), "ancestors", null);
        setField(term8960, term8960.getClass(), "excludes", null);
        setField(term8960, term8960.getClass(), "ignoreEndTags", null);
        setBooleanField(term8960, term8960.getClass(), "directDescendant", false);
        setBooleanField(term8960, term8960.getClass(), "limitChildren", true);
        Object term8971 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        setField(term8971, term8971.getClass(), "tagName", null);
        setBooleanField(term8971, term8971.getClass(), "knownTag", false);
        setBooleanField(term8971, term8971.getClass(), "isBlock", true);
        setBooleanField(term8971, term8971.getClass(), "canContainBlock", false);
        setBooleanField(term8971, term8971.getClass(), "canContainInline", true);
        setBooleanField(term8971, term8971.getClass(), "optionalClosing", true);
        setBooleanField(term8971, term8971.getClass(), "empty", false);
        setBooleanField(term8971, term8971.getClass(), "selfClosing", true);
        setBooleanField(term8971, term8971.getClass(), "preserveWhitespace", false);
        setField(term8971, term8971.getClass(), "ancestors", null);
        setField(term8971, term8971.getClass(), "excludes", null);
        setField(term8971, term8971.getClass(), "ignoreEndTags", null);
        setBooleanField(term8971, term8971.getClass(), "directDescendant", false);
        setBooleanField(term8971, term8971.getClass(), "limitChildren", false);
        ArrayList term8936 = new ArrayList();
        ((ArrayList) term8936).add(term8938);
        ((ArrayList) term8936).add(term8912);
        ((ArrayList) term8936).add(term8949);
        ((ArrayList) term8936).add(term8960);
        ((ArrayList) term8936).add(term8923);
        ((ArrayList) term8936).add(term8960);
        ((ArrayList) term8936).add(term8971);
        ((ArrayList) term8936).add(term8971);
        ArrayList term8984 = new ArrayList();
        HashMap term8991 = new HashMap();
        Set<Object> term9250 =  ((Map) term8991).keySet();
        HashSet term8990 = new HashSet((Collection<? extends Object>) term9250);
        ArrayList term9007 = new ArrayList();
        ((ArrayList) term9007).add((Object)null);
        ((ArrayList) term9007).add((Object)null);
        ((ArrayList) term9007).add((Object)null);
        ((ArrayList) term9007).add((Object)null);
        LinkedHashMap term9012 = new LinkedHashMap();
        term8870 = newInstance(Class.forName("org.jsoup.nodes.Document"));
        Object term8871 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        Object term8889 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9011 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8871, term8871.getClass(), "escapeMode", enum4);
        setField(term8871, term8871.getClass(), "charset", null);
        setField(term8871, term8871.getClass(), "charsetEncoder", null);
        setBooleanField(term8871, term8871.getClass(), "prettyPrint", true);
        setIntField(term8871, term8871.getClass(), "indentAmount", 1227103734);
        setField(term8871, term8871.getClass(), "this$0", null);
        setField(term8870, term8870.getClass(), "outputSettings", term8871);
        setField(term8889, term8889.getClass(), "tagName", "UoYtihxVaS");
        setBooleanField(term8889, term8889.getClass(), "knownTag", true);
        setBooleanField(term8889, term8889.getClass(), "isBlock", true);
        setBooleanField(term8889, term8889.getClass(), "canContainBlock", true);
        setBooleanField(term8889, term8889.getClass(), "canContainInline", true);
        setBooleanField(term8889, term8889.getClass(), "optionalClosing", true);
        setBooleanField(term8889, term8889.getClass(), "empty", true);
        setBooleanField(term8889, term8889.getClass(), "selfClosing", false);
        setBooleanField(term8889, term8889.getClass(), "preserveWhitespace", false);
        setField(term8889, term8889.getClass(), "ancestors", term8910);
        setField(term8889, term8889.getClass(), "excludes", term8936);
        setField(term8889, term8889.getClass(), "ignoreEndTags", term8984);
        setBooleanField(term8889, term8889.getClass(), "directDescendant", true);
        setBooleanField(term8889, term8889.getClass(), "limitChildren", false);
        setField(term8870, term8870.getClass(), "tag", term8889);
        setField(term8870, term8870.getClass(), "classNames", term8990);
        setField(term8870, term8870.getClass(), "parentNode", null);
        setField(term8870, term8870.getClass(), "childNodes", term9007);
        setField(term9011, term9011.getClass(), "attributes", term9012);
        setField(term8870, term8870.getClass(), "attributes", term9011);
        setField(term8870, term8870.getClass(), "baseUri", "fhkbdRViHi");
        setIntField(term8870, term8870.getClass(), "siblingIndex", -1339778481);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Document");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "uWHnvSvaPl";
        callMethod(klass, "createElement", argTypes, term8870, args);
    }

};


