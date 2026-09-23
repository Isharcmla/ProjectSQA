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
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.lang.Integer;

public class Element_outerHtmlHead_92961047484 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8236;
     Object term8299;
     Object term8319;
     Object term8321;

    public Element_outerHtmlHead_92961047484() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8258 = new HashMap();
        Set<Object> term8334 =  ((Map) term8258).keySet();
        HashSet term8257 = new HashSet((Collection<? extends Object>) term8334);
        ArrayList term8270 = new ArrayList();
        ((ArrayList) term8270).add((Object)null);
        ((ArrayList) term8270).add((Object)null);
        ((ArrayList) term8270).add((Object)null);
        ((ArrayList) term8270).add((Object)null);
        ((ArrayList) term8270).add((Object)null);
        ((ArrayList) term8270).add((Object)null);
        ((ArrayList) term8270).add((Object)null);
        ((ArrayList) term8270).add((Object)null);
        LinkedHashMap term8275 = new LinkedHashMap();
        term8236 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8237 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8274 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8237, term8237.getClass(), "tagName", "kucsxnvbES");
        setBooleanField(term8237, term8237.getClass(), "isBlock", true);
        setBooleanField(term8237, term8237.getClass(), "formatAsBlock", false);
        setBooleanField(term8237, term8237.getClass(), "canContainBlock", true);
        setBooleanField(term8237, term8237.getClass(), "canContainInline", false);
        setBooleanField(term8237, term8237.getClass(), "empty", true);
        setBooleanField(term8237, term8237.getClass(), "selfClosing", true);
        setBooleanField(term8237, term8237.getClass(), "preserveWhitespace", false);
        setField(term8236, term8236.getClass(), "tag", term8237);
        setField(term8236, term8236.getClass(), "classNames", term8257);
        setField(term8236, term8236.getClass(), "parentNode", null);
        setField(term8236, term8236.getClass(), "childNodes", term8270);
        setField(term8274, term8274.getClass(), "attributes", term8275);
        setField(term8236, term8236.getClass(), "attributes", term8274);
        setField(term8236, term8236.getClass(), "baseUri", "jlcBpLoWfd");
        setIntField(term8236, term8236.getClass(), "siblingIndex", -2066804303);
        term8299 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8300 = (byte[]) newByteArray(16);
        setField(term8299, term8299.getClass(), "value", term8300);
        setByteField(term8299, term8299.getClass(), "coder", (byte) 18);
        setIntField(term8299, term8299.getClass(), "count", -1731761810);
        term8319 = new Integer(197109649);
        term8321 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term8321, term8321.getClass(), "escapeMode", null);
        setField(term8321, term8321.getClass(), "charset", null);
        setField(term8321, term8321.getClass(), "charsetEncoder", null);
        setBooleanField(term8321, term8321.getClass(), "prettyPrint", true);
        setIntField(term8321, term8321.getClass(), "indentAmount", -1239406390);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term8299;
        args[1] = term8319;
        args[2] = term8321;
        callMethod(klass, "outerHtmlHead", argTypes, term8236, args);
    }

};


