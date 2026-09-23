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

public class Element_outerHtmlTail_126971221884 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8228;
     Object term8297;
     Object term8317;
     Object term8319;

    public Element_outerHtmlTail_126971221884() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        HashMap term8252 = new HashMap();
        Set<Object> term8333 =  ((Map) term8252).keySet();
        HashSet term8251 = new HashSet((Collection<? extends Object>) term8333);
        ArrayList term8268 = new ArrayList();
        ((ArrayList) term8268).add((Object)null);
        LinkedHashMap term8273 = new LinkedHashMap();
        term8228 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8229 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8272 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8229, term8229.getClass(), "tagName", "PoTZjDuBHa");
        setBooleanField(term8229, term8229.getClass(), "isBlock", false);
        setBooleanField(term8229, term8229.getClass(), "formatAsBlock", false);
        setBooleanField(term8229, term8229.getClass(), "canContainBlock", false);
        setBooleanField(term8229, term8229.getClass(), "canContainInline", true);
        setBooleanField(term8229, term8229.getClass(), "empty", false);
        setBooleanField(term8229, term8229.getClass(), "selfClosing", false);
        setBooleanField(term8229, term8229.getClass(), "preserveWhitespace", true);
        setBooleanField(term8229, term8229.getClass(), "formList", false);
        setBooleanField(term8229, term8229.getClass(), "formSubmit", true);
        setField(term8228, term8228.getClass(), "tag", term8229);
        setField(term8228, term8228.getClass(), "classNames", term8251);
        setField(term8228, term8228.getClass(), "parentNode", null);
        setField(term8228, term8228.getClass(), "childNodes", term8268);
        setField(term8272, term8272.getClass(), "attributes", term8273);
        setField(term8228, term8228.getClass(), "attributes", term8272);
        setField(term8228, term8228.getClass(), "baseUri", "MAnhIPOtHL");
        setIntField(term8228, term8228.getClass(), "siblingIndex", -2066804303);
        term8297 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8298 = (byte[]) newByteArray(16);
        setField(term8297, term8297.getClass(), "value", term8298);
        setByteField(term8297, term8297.getClass(), "coder", (byte) 18);
        setIntField(term8297, term8297.getClass(), "count", -1731761810);
        term8317 = new Integer(197109649);
        term8319 = newInstance(Class.forName("org.jsoup.nodes.Document$OutputSettings"));
        setField(term8319, term8319.getClass(), "escapeMode", null);
        setField(term8319, term8319.getClass(), "charset", null);
        setField(term8319, term8319.getClass(), "charsetEncoder", null);
        setBooleanField(term8319, term8319.getClass(), "prettyPrint", true);
        setBooleanField(term8319, term8319.getClass(), "outline", true);
        setIntField(term8319, term8319.getClass(), "indentAmount", -1239406390);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[3];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        argTypes[1] = int.class;
        argTypes[2] = Class.forName("org.jsoup.nodes.Document$OutputSettings");
        Object[] args = new Object[3];
        args[0] = term8297;
        args[1] = term8317;
        args[2] = term8319;
        callMethod(klass, "outerHtmlTail", argTypes, term8228, args);
    }

};


