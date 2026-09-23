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

public class Element_getElementsMatchingOwnText_210255518579 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term6146;

    public Element_getElementsMatchingOwnText_210255518579() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term6172 = new ArrayList();
        ((ArrayList) term6172).add((Object)null);
        ((ArrayList) term6172).add((Object)null);
        ((ArrayList) term6172).add((Object)null);
        ((ArrayList) term6172).add((Object)null);
        ((ArrayList) term6172).add((Object)null);
        ((ArrayList) term6172).add((Object)null);
        ((ArrayList) term6172).add((Object)null);
        term6146 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term6147 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term6168 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term6169 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term6170 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term6176 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term6178 = (Object[]) newArray("java.lang.String", 0);
        Object[] term6179 = (Object[]) newArray("java.lang.String", 0);
        setField(term6147, term6147.getClass(), "tagName", "iikZEapDlu");
        setBooleanField(term6147, term6147.getClass(), "isBlock", true);
        setBooleanField(term6147, term6147.getClass(), "formatAsBlock", false);
        setBooleanField(term6147, term6147.getClass(), "canContainInline", true);
        setBooleanField(term6147, term6147.getClass(), "empty", false);
        setBooleanField(term6147, term6147.getClass(), "selfClosing", false);
        setBooleanField(term6147, term6147.getClass(), "preserveWhitespace", false);
        setBooleanField(term6147, term6147.getClass(), "formList", true);
        setBooleanField(term6147, term6147.getClass(), "formSubmit", false);
        setField(term6146, term6146.getClass(), "tag", term6147);
        setField(term6168, term6168.getClass(), "referent", null);
        setField(term6169, term6169.getClass(), "lock", term6170);
        setField(term6169, term6169.getClass(), "head", null);
        setLongField(term6169, term6169.getClass(), "queueLength", 682356318767179819L);
        setField(term6168, term6168.getClass(), "queue", term6169);
        setField(term6168, term6168.getClass(), "next", null);
        setField(term6168, term6168.getClass(), "discovered", null);
        setField(term6146, term6146.getClass(), "shadowChildrenRef", term6168);
        setField(term6146, term6146.getClass(), "childNodes", term6172);
        setIntField(term6176, term6176.getClass(), "size", -916584829);
        setField(term6176, term6176.getClass(), "keys", term6178);
        setField(term6176, term6176.getClass(), "vals", term6179);
        setField(term6146, term6146.getClass(), "attributes", term6176);
        setField(term6146, term6146.getClass(), "baseUri", "nhoHrZfnIN");
        setField(term6146, term6146.getClass(), "parentNode", null);
        setIntField(term6146, term6146.getClass(), "siblingIndex", -2131181468);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "ZkMALXpEAZ";
        callMethod(klass, "getElementsMatchingOwnText", argTypes, term6146, args);
    }

};


