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

public class Element_attr_298745360101 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term588;
     Object term9650;
     Object term9598;

    public Element_attr_298745360101() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term611 = new ArrayList();
        ((ArrayList) term611).add((Object)null);
        ((ArrayList) term611).add((Object)null);
        LinkedHashMap term616 = new LinkedHashMap();
        term588 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term589 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term615 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term589, term589.getClass(), "tagName", "nyiiPDVjAc");
        setBooleanField(term589, term589.getClass(), "isBlock", false);
        setBooleanField(term589, term589.getClass(), "formatAsBlock", false);
        setBooleanField(term589, term589.getClass(), "canContainBlock", false);
        setBooleanField(term589, term589.getClass(), "canContainInline", false);
        setBooleanField(term589, term589.getClass(), "empty", true);
        setBooleanField(term589, term589.getClass(), "selfClosing", false);
        setBooleanField(term589, term589.getClass(), "preserveWhitespace", false);
        setBooleanField(term589, term589.getClass(), "formList", true);
        setBooleanField(term589, term589.getClass(), "formSubmit", false);
        setField(term588, term588.getClass(), "tag", term589);
        setField(term588, term588.getClass(), "parentNode", null);
        setField(term588, term588.getClass(), "childNodes", term611);
        setField(term615, term615.getClass(), "attributes", term616);
        setField(term588, term588.getClass(), "attributes", term615);
        setField(term588, term588.getClass(), "baseUri", "gGSMzuGICf");
        setIntField(term588, term588.getClass(), "siblingIndex", -1955890973);
        ArrayList term9654 = new ArrayList();
        ((ArrayList) term9654).add((Object)null);
        ((ArrayList) term9654).add((Object)null);
        LinkedHashMap term9657 = new LinkedHashMap();
        term9650 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9651 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9656 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9651, term9651.getClass(), "tagName", "nyiiPDVjAc");
        setBooleanField(term9651, term9651.getClass(), "isBlock", false);
        setBooleanField(term9651, term9651.getClass(), "formatAsBlock", false);
        setBooleanField(term9651, term9651.getClass(), "canContainBlock", false);
        setBooleanField(term9651, term9651.getClass(), "canContainInline", false);
        setBooleanField(term9651, term9651.getClass(), "empty", true);
        setBooleanField(term9651, term9651.getClass(), "selfClosing", false);
        setBooleanField(term9651, term9651.getClass(), "preserveWhitespace", false);
        setBooleanField(term9651, term9651.getClass(), "formList", true);
        setBooleanField(term9651, term9651.getClass(), "formSubmit", false);
        setField(term9650, term9650.getClass(), "tag", term9651);
        setField(term9650, term9650.getClass(), "parentNode", null);
        setField(term9650, term9650.getClass(), "childNodes", term9654);
        setField(term9656, term9656.getClass(), "attributes", term9657);
        setField(term9650, term9650.getClass(), "attributes", term9656);
        setField(term9650, term9650.getClass(), "baseUri", "gGSMzuGICf");
        setIntField(term9650, term9650.getClass(), "siblingIndex", -1955890973);
        ArrayList term9621 = new ArrayList();
        ((ArrayList) term9621).add((Object)null);
        ((ArrayList) term9621).add((Object)null);
        LinkedHashMap term9626 = new LinkedHashMap();
        term9598 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9599 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9625 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9599, term9599.getClass(), "tagName", "nyiiPDVjAc");
        setBooleanField(term9599, term9599.getClass(), "isBlock", false);
        setBooleanField(term9599, term9599.getClass(), "formatAsBlock", false);
        setBooleanField(term9599, term9599.getClass(), "canContainBlock", false);
        setBooleanField(term9599, term9599.getClass(), "canContainInline", false);
        setBooleanField(term9599, term9599.getClass(), "empty", true);
        setBooleanField(term9599, term9599.getClass(), "selfClosing", false);
        setBooleanField(term9599, term9599.getClass(), "preserveWhitespace", false);
        setBooleanField(term9599, term9599.getClass(), "formList", true);
        setBooleanField(term9599, term9599.getClass(), "formSubmit", false);
        setField(term9598, term9598.getClass(), "tag", term9599);
        setField(term9598, term9598.getClass(), "parentNode", null);
        setField(term9598, term9598.getClass(), "childNodes", term9621);
        setField(term9625, term9625.getClass(), "attributes", term9626);
        setField(term9598, term9598.getClass(), "attributes", term9625);
        setField(term9598, term9598.getClass(), "baseUri", "gGSMzuGICf");
        setIntField(term9598, term9598.getClass(), "siblingIndex", -1955890973);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[2];
        argTypes[0] = Class.forName("java.lang.String");
        argTypes[1] = Class.forName("java.lang.String");
        Object[] args = new Object[2];
        args[0] = "hxCBltsObl";
        args[1] = "BndsHwAFMv";
        Object retValue = callMethod(klass, "attr", argTypes, term588, args);
        assertTrue(recursiveEquals(term588, term9650));
        assertTrue(recursiveEquals(retValue, term9598));
    }

};


