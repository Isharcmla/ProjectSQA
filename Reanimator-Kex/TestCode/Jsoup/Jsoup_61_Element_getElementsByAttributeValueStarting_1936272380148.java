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
import static org.jsoup.nodes.EqualityUtils.*;
import java.lang.Object;
import java.util.ArrayList;
import java.util.LinkedHashMap;

public class Element_getElementsByAttributeValueStarting_1936272380148 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term4032;
     Object term26225;
     Object term26221;

    public Element_getElementsByAttributeValueStarting_1936272380148() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term4054 = new ArrayList();
        ((ArrayList) term4054).add((Object)null);
        ((ArrayList) term4054).add((Object)null);
        ((ArrayList) term4054).add((Object)null);
        ((ArrayList) term4054).add((Object)null);
        ((ArrayList) term4054).add((Object)null);
        ((ArrayList) term4054).add((Object)null);
        LinkedHashMap term4059 = new LinkedHashMap();
        term4032 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term4033 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term4058 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term4033, term4033.getClass(), "tagName", "OcfNzHYdki");
        setBooleanField(term4033, term4033.getClass(), "isBlock", false);
        setBooleanField(term4033, term4033.getClass(), "formatAsBlock", false);
        setBooleanField(term4033, term4033.getClass(), "canContainInline", false);
        setBooleanField(term4033, term4033.getClass(), "empty", true);
        setBooleanField(term4033, term4033.getClass(), "selfClosing", true);
        setBooleanField(term4033, term4033.getClass(), "preserveWhitespace", false);
        setBooleanField(term4033, term4033.getClass(), "formList", true);
        setBooleanField(term4033, term4033.getClass(), "formSubmit", false);
        setField(term4032, term4032.getClass(), "tag", term4033);
        setField(term4032, term4032.getClass(), "parentNode", null);
        setField(term4032, term4032.getClass(), "childNodes", term4054);
        setField(term4058, term4058.getClass(), "attributes", term4059);
        setField(term4032, term4032.getClass(), "attributes", term4058);
        setField(term4032, term4032.getClass(), "baseUri", "FjOiNAfBOc");
        setIntField(term4032, term4032.getClass(), "siblingIndex", 454281060);
        ArrayList term26229 = new ArrayList();
        ((ArrayList) term26229).add((Object)null);
        ((ArrayList) term26229).add((Object)null);
        ((ArrayList) term26229).add((Object)null);
        ((ArrayList) term26229).add((Object)null);
        ((ArrayList) term26229).add((Object)null);
        ((ArrayList) term26229).add((Object)null);
        LinkedHashMap term26232 = new LinkedHashMap();
        term26225 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term26226 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term26231 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term26226, term26226.getClass(), "tagName", "OcfNzHYdki");
        setBooleanField(term26226, term26226.getClass(), "isBlock", false);
        setBooleanField(term26226, term26226.getClass(), "formatAsBlock", false);
        setBooleanField(term26226, term26226.getClass(), "canContainInline", false);
        setBooleanField(term26226, term26226.getClass(), "empty", true);
        setBooleanField(term26226, term26226.getClass(), "selfClosing", true);
        setBooleanField(term26226, term26226.getClass(), "preserveWhitespace", false);
        setBooleanField(term26226, term26226.getClass(), "formList", true);
        setBooleanField(term26226, term26226.getClass(), "formSubmit", false);
        setField(term26225, term26225.getClass(), "tag", term26226);
        setField(term26225, term26225.getClass(), "parentNode", null);
        setField(term26225, term26225.getClass(), "childNodes", term26229);
        setField(term26231, term26231.getClass(), "attributes", term26232);
        setField(term26225, term26225.getClass(), "attributes", term26231);
        setField(term26225, term26225.getClass(), "baseUri", "FjOiNAfBOc");
        setIntField(term26225, term26225.getClass(), "siblingIndex", 454281060);
        term26221 = newInstance(Class.forName("org.jsoup.select.Elements"));
        Object[] term26222 = (Object[]) newArray("java.lang.Object", 0);
        setField(term26221, term26221.getClass(), "elementData", term26222);
        setIntField(term26221, term26221.getClass(), "size", 0);
        setIntField(term26221, term26221.getClass(), "modCount", 0);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "iCCsaLHohG";
        args[1] = "NJhGgctbdj";
        Object retValue = callMethod(klass, "getElementsByAttributeValueStarting", argTypes, term4032, args);
        assertTrue(recursiveEquals(term4032, term26225));
        assertTrue(recursiveEquals(retValue, term26221));
    }

};


