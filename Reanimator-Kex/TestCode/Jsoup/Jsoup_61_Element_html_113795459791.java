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
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_html_113795459791 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7972;
     Object term8023;

    public Element_html_113795459791() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7994 = new ArrayList();
        ((ArrayList) term7994).add((Object)null);
        ((ArrayList) term7994).add((Object)null);
        ((ArrayList) term7994).add((Object)null);
        ((ArrayList) term7994).add((Object)null);
        ((ArrayList) term7994).add((Object)null);
        ((ArrayList) term7994).add((Object)null);
        LinkedHashMap term7999 = new LinkedHashMap();
        term7972 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term7973 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term7998 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term7973, term7973.getClass(), "tagName", "qphdrqUtNx");
        setBooleanField(term7973, term7973.getClass(), "isBlock", true);
        setBooleanField(term7973, term7973.getClass(), "formatAsBlock", false);
        setBooleanField(term7973, term7973.getClass(), "canContainInline", true);
        setBooleanField(term7973, term7973.getClass(), "empty", false);
        setBooleanField(term7973, term7973.getClass(), "selfClosing", true);
        setBooleanField(term7973, term7973.getClass(), "preserveWhitespace", false);
        setBooleanField(term7973, term7973.getClass(), "formList", false);
        setBooleanField(term7973, term7973.getClass(), "formSubmit", true);
        setField(term7972, term7972.getClass(), "tag", term7973);
        setField(term7972, term7972.getClass(), "parentNode", null);
        setField(term7972, term7972.getClass(), "childNodes", term7994);
        setField(term7998, term7998.getClass(), "attributes", term7999);
        setField(term7972, term7972.getClass(), "attributes", term7998);
        setField(term7972, term7972.getClass(), "baseUri", "goAoCMhKBu");
        setIntField(term7972, term7972.getClass(), "siblingIndex", -1970452551);
        term8023 = newInstance(Class.forName("java.lang.StringBuilder"));
        byte[] term8024 = (byte[]) newByteArray(16);
        setField(term8023, term8023.getClass(), "value", term8024);
        setByteField(term8023, term8023.getClass(), "coder", (byte) 75);
        setIntField(term8023, term8023.getClass(), "count", -1896376975);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.StringBuilder");
        Object[] args = new Object[1];
        args[0] = term8023;
        callMethod(klass, "html", argTypes, term7972, args);
    }

};


