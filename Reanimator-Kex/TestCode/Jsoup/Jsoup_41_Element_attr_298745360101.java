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
     Object term9663;
     Object term9611;

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
        ArrayList term9667 = new ArrayList();
        ((ArrayList) term9667).add((Object)null);
        ((ArrayList) term9667).add((Object)null);
        LinkedHashMap term9670 = new LinkedHashMap();
        term9663 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9664 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9669 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9664, term9664.getClass(), "tagName", "nyiiPDVjAc");
        setBooleanField(term9664, term9664.getClass(), "isBlock", false);
        setBooleanField(term9664, term9664.getClass(), "formatAsBlock", false);
        setBooleanField(term9664, term9664.getClass(), "canContainBlock", false);
        setBooleanField(term9664, term9664.getClass(), "canContainInline", false);
        setBooleanField(term9664, term9664.getClass(), "empty", true);
        setBooleanField(term9664, term9664.getClass(), "selfClosing", false);
        setBooleanField(term9664, term9664.getClass(), "preserveWhitespace", false);
        setBooleanField(term9664, term9664.getClass(), "formList", true);
        setBooleanField(term9664, term9664.getClass(), "formSubmit", false);
        setField(term9663, term9663.getClass(), "tag", term9664);
        setField(term9663, term9663.getClass(), "parentNode", null);
        setField(term9663, term9663.getClass(), "childNodes", term9667);
        setField(term9669, term9669.getClass(), "attributes", term9670);
        setField(term9663, term9663.getClass(), "attributes", term9669);
        setField(term9663, term9663.getClass(), "baseUri", "gGSMzuGICf");
        setIntField(term9663, term9663.getClass(), "siblingIndex", -1955890973);
        ArrayList term9634 = new ArrayList();
        ((ArrayList) term9634).add((Object)null);
        ((ArrayList) term9634).add((Object)null);
        LinkedHashMap term9639 = new LinkedHashMap();
        term9611 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9612 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9638 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        setField(term9612, term9612.getClass(), "tagName", "nyiiPDVjAc");
        setBooleanField(term9612, term9612.getClass(), "isBlock", false);
        setBooleanField(term9612, term9612.getClass(), "formatAsBlock", false);
        setBooleanField(term9612, term9612.getClass(), "canContainBlock", false);
        setBooleanField(term9612, term9612.getClass(), "canContainInline", false);
        setBooleanField(term9612, term9612.getClass(), "empty", true);
        setBooleanField(term9612, term9612.getClass(), "selfClosing", false);
        setBooleanField(term9612, term9612.getClass(), "preserveWhitespace", false);
        setBooleanField(term9612, term9612.getClass(), "formList", true);
        setBooleanField(term9612, term9612.getClass(), "formSubmit", false);
        setField(term9611, term9611.getClass(), "tag", term9612);
        setField(term9611, term9611.getClass(), "parentNode", null);
        setField(term9611, term9611.getClass(), "childNodes", term9634);
        setField(term9638, term9638.getClass(), "attributes", term9639);
        setField(term9611, term9611.getClass(), "attributes", term9638);
        setField(term9611, term9611.getClass(), "baseUri", "gGSMzuGICf");
        setIntField(term9611, term9611.getClass(), "siblingIndex", -1955890973);
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
        assertTrue(recursiveEquals(term588, term9663));
        assertTrue(recursiveEquals(retValue, term9611));
    }

};


