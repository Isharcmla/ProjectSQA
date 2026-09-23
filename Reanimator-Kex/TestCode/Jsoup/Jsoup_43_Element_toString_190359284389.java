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

public class Element_toString_190359284389 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term8069;

    public Element_toString_190359284389() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term8092 = new ArrayList();
        ((ArrayList) term8092).add((Object)null);
        ((ArrayList) term8092).add((Object)null);
        ((ArrayList) term8092).add((Object)null);
        ((ArrayList) term8092).add((Object)null);
        ((ArrayList) term8092).add((Object)null);
        ((ArrayList) term8092).add((Object)null);
        LinkedHashMap term8097 = new LinkedHashMap();
        term8069 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term8070 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term8096 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term8070, term8070.getClass(), "tagName", "wsysQLGFnl");
        setBooleanField(term8070, term8070.getClass(), "isBlock", true);
        setBooleanField(term8070, term8070.getClass(), "formatAsBlock", false);
        setBooleanField(term8070, term8070.getClass(), "canContainBlock", false);
        setBooleanField(term8070, term8070.getClass(), "canContainInline", true);
        setBooleanField(term8070, term8070.getClass(), "empty", true);
        setBooleanField(term8070, term8070.getClass(), "selfClosing", false);
        setBooleanField(term8070, term8070.getClass(), "preserveWhitespace", false);
        setBooleanField(term8070, term8070.getClass(), "formList", false);
        setBooleanField(term8070, term8070.getClass(), "formSubmit", false);
        setField(term8069, term8069.getClass(), "tag", term8070);
        setField(term8069, term8069.getClass(), "parentNode", null);
        setField(term8069, term8069.getClass(), "childNodes", term8092);
        setField(term8096, term8096.getClass(), "attributes", term8097);
        setField(term8069, term8069.getClass(), "attributes", term8096);
        setField(term8069, term8069.getClass(), "baseUri", "JWodNQzjjV");
        setIntField(term8069, term8069.getClass(), "siblingIndex", -2066804303);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "toString", argTypes, term8069, args);
    }

};


