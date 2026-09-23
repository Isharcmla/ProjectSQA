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

public class Element_clone_1145458980106 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term9146;

    public Element_clone_1145458980106() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term9172 = new ArrayList();
        ((ArrayList) term9172).add((Object)null);
        ((ArrayList) term9172).add((Object)null);
        ((ArrayList) term9172).add((Object)null);
        ((ArrayList) term9172).add((Object)null);
        ((ArrayList) term9172).add((Object)null);
        ((ArrayList) term9172).add((Object)null);
        ((ArrayList) term9172).add((Object)null);
        ((ArrayList) term9172).add((Object)null);
        term9146 = newInstance(Class.forName("org.jsoup.nodes.Element"));
        Object term9147 = newInstance(Class.forName("org.jsoup.parser.Tag"));
        Object term9168 = newInstance(Class.forName("java.lang.ref.WeakReference"));
        Object term9169 = newInstance(Class.forName("java.lang.ref.ReferenceQueue"));
        Object term9170 = newInstance(Class.forName("java.lang.ref.ReferenceQueue$Lock"));
        Object term9176 = newInstance(Class.forName("org.jsoup.nodes.Attributes"));
        Object[] term9178 = (Object[]) newArray("java.lang.String", 0);
        Object[] term9179 = (Object[]) newArray("java.lang.String", 0);
        setField(term9147, term9147.getClass(), "tagName", "ypEdrstygY");
        setBooleanField(term9147, term9147.getClass(), "isBlock", true);
        setBooleanField(term9147, term9147.getClass(), "formatAsBlock", false);
        setBooleanField(term9147, term9147.getClass(), "canContainInline", false);
        setBooleanField(term9147, term9147.getClass(), "empty", false);
        setBooleanField(term9147, term9147.getClass(), "selfClosing", true);
        setBooleanField(term9147, term9147.getClass(), "preserveWhitespace", true);
        setBooleanField(term9147, term9147.getClass(), "formList", false);
        setBooleanField(term9147, term9147.getClass(), "formSubmit", true);
        setField(term9146, term9146.getClass(), "tag", term9147);
        setField(term9168, term9168.getClass(), "referent", null);
        setField(term9169, term9169.getClass(), "lock", term9170);
        setField(term9169, term9169.getClass(), "head", null);
        setLongField(term9169, term9169.getClass(), "queueLength", 4949335493504695457L);
        setField(term9168, term9168.getClass(), "queue", term9169);
        setField(term9168, term9168.getClass(), "next", null);
        setField(term9168, term9168.getClass(), "discovered", null);
        setField(term9146, term9146.getClass(), "shadowChildrenRef", term9168);
        setField(term9146, term9146.getClass(), "childNodes", term9172);
        setIntField(term9176, term9176.getClass(), "size", 2009020256);
        setField(term9176, term9176.getClass(), "keys", term9178);
        setField(term9176, term9176.getClass(), "vals", term9179);
        setField(term9146, term9146.getClass(), "attributes", term9176);
        setField(term9146, term9146.getClass(), "baseUri", "sNQFlATEeQ");
        setField(term9146, term9146.getClass(), "parentNode", null);
        setIntField(term9146, term9146.getClass(), "siblingIndex", 2049577015);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.nodes.Element");
        Class<?>[] argTypes = new Class<?>[0];
        Object[] args = new Object[0];
        callMethod(klass, "clone", argTypes, term9146, args);
    }

};


