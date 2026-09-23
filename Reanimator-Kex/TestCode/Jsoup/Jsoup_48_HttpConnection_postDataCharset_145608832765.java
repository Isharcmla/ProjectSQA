package org.jsoup.helper;

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
import java.nio.charset.IllegalCharsetNameException;
import static org.jsoup.helper.ReflectionUtils.*;
import static org.junit.Assert.assertTrue;
import java.lang.Object;
import java.util.ArrayList;
import java.lang.String;
import java.util.LinkedHashMap;

public class HttpConnection_postDataCharset_145608832765 {
    @Rule public Timeout globalTimeout = new Timeout(10, TimeUnit.SECONDS);
     Object term7330;

    public HttpConnection_postDataCharset_145608832765() {
    }

    public <T> T unknown() {
        throw new IllegalStateException();
    }

    @Before
    public void setup() throws Throwable {
        ArrayList term7335 = new ArrayList();
        ArrayList term7344 = new ArrayList();
        ArrayList term7347 = new ArrayList();
        Class<? extends Object> term28926 = Class.forName((String) "org.jsoup.Connection$Method");
        Field term28925 = ((Class) term28926).getDeclaredField((String) "GET");
        ((Field) term28925).setAccessible(true);
        Object enum95 = ((Field) term28925).get((Object) null);
        LinkedHashMap term7384 = new LinkedHashMap();
        LinkedHashMap term7395 = new LinkedHashMap();
        LinkedHashMap term7405 = new LinkedHashMap();
        LinkedHashMap term7411 = new LinkedHashMap();
        term7330 = newInstance(Class.forName("org.jsoup.helper.HttpConnection"));
        Object term7331 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Request"));
        Object term7341 = newInstance(Class.forName("org.jsoup.parser.Parser"));
        Object term7342 = newInstance(Class.forName("org.jsoup.parser.HtmlTreeBuilder"));
        Object term7350 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object[] term7357 = (Object[]) newArray("java.lang.String", 1);
        Object term7358 = newInstance(Class.forName("org.jsoup.parser.Token$StartTag"));
        Object term7362 = newInstance(Class.forName("org.jsoup.parser.Token$EndTag"));
        Object term7401 = newInstance(Class.forName("org.jsoup.helper.HttpConnection$Response"));
        setIntField(term7331, term7331.getClass(), "timeoutMilliseconds", 3000);
        setIntField(term7331, term7331.getClass(), "maxBodySizeBytes", 1048576);
        setBooleanField(term7331, term7331.getClass(), "followRedirects", true);
        setField(term7331, term7331.getClass(), "data", term7335);
        setBooleanField(term7331, term7331.getClass(), "ignoreHttpErrors", false);
        setBooleanField(term7331, term7331.getClass(), "ignoreContentType", false);
        setField(term7342, term7342.getClass(), "state", null);
        setField(term7342, term7342.getClass(), "originalState", null);
        setBooleanField(term7342, term7342.getClass(), "baseUriSetFromDoc", false);
        setField(term7342, term7342.getClass(), "headElement", null);
        setField(term7342, term7342.getClass(), "formElement", null);
        setField(term7342, term7342.getClass(), "contextElement", null);
        setField(term7342, term7342.getClass(), "formattingElements", term7344);
        setField(term7342, term7342.getClass(), "pendingTableCharacters", term7347);
        setField(term7350, term7350.getClass(), "tagName", null);
        setField(term7350, term7350.getClass(), "pendingAttributeName", null);
        setField(term7350, term7350.getClass(), "pendingAttributeValue", null);
        setBooleanField(term7350, term7350.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term7350, term7350.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term7350, term7350.getClass(), "selfClosing", false);
        setField(term7350, term7350.getClass(), "attributes", null);
        setField(term7350, term7350.getClass(), "type", null);
        setField(term7342, term7342.getClass(), "emptyEnd", term7350);
        setBooleanField(term7342, term7342.getClass(), "framesetOk", true);
        setBooleanField(term7342, term7342.getClass(), "fosterInserts", false);
        setBooleanField(term7342, term7342.getClass(), "fragmentParsing", false);
        setField(term7342, term7342.getClass(), "specificScopeTarget", term7357);
        setField(term7342, term7342.getClass(), "reader", null);
        setField(term7342, term7342.getClass(), "tokeniser", null);
        setField(term7342, term7342.getClass(), "doc", null);
        setField(term7342, term7342.getClass(), "stack", null);
        setField(term7342, term7342.getClass(), "baseUri", null);
        setField(term7342, term7342.getClass(), "currentToken", null);
        setField(term7342, term7342.getClass(), "errors", null);
        setField(term7358, term7358.getClass(), "tagName", null);
        setField(term7358, term7358.getClass(), "pendingAttributeName", null);
        setField(term7358, term7358.getClass(), "pendingAttributeValue", null);
        setBooleanField(term7358, term7358.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term7358, term7358.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term7358, term7358.getClass(), "selfClosing", false);
        setField(term7358, term7358.getClass(), "attributes", null);
        setField(term7358, term7358.getClass(), "type", null);
        setField(term7342, term7342.getClass(), "start", term7358);
        setField(term7362, term7362.getClass(), "tagName", null);
        setField(term7362, term7362.getClass(), "pendingAttributeName", null);
        setField(term7362, term7362.getClass(), "pendingAttributeValue", null);
        setBooleanField(term7362, term7362.getClass(), "hasEmptyAttributeValue", false);
        setBooleanField(term7362, term7362.getClass(), "hasPendingAttributeValue", false);
        setBooleanField(term7362, term7362.getClass(), "selfClosing", false);
        setField(term7362, term7362.getClass(), "attributes", null);
        setField(term7362, term7362.getClass(), "type", null);
        setField(term7342, term7342.getClass(), "end", term7362);
        setField(term7341, term7341.getClass(), "treeBuilder", term7342);
        setIntField(term7341, term7341.getClass(), "maxErrors", 0);
        setField(term7341, term7341.getClass(), "errors", null);
        setField(term7331, term7331.getClass(), "parser", term7341);
        setBooleanField(term7331, term7331.getClass(), "parserDefined", false);
        setBooleanField(term7331, term7331.getClass(), "validateTSLCertificates", true);
        setField(term7331, term7331.getClass(), "postDataCharset", "UTF-8");
        setField(term7331, term7331.getClass(), "url", null);
        setField(term7331, term7331.getClass(), "method", enum95);
        setField(term7331, term7331.getClass(), "headers", term7384);
        setField(term7331, term7331.getClass(), "cookies", term7395);
        setField(term7330, term7330.getClass(), "req", term7331);
        setIntField(term7401, term7401.getClass(), "statusCode", 0);
        setField(term7401, term7401.getClass(), "statusMessage", null);
        setField(term7401, term7401.getClass(), "byteData", null);
        setField(term7401, term7401.getClass(), "charset", null);
        setField(term7401, term7401.getClass(), "contentType", null);
        setBooleanField(term7401, term7401.getClass(), "executed", false);
        setIntField(term7401, term7401.getClass(), "numRedirects", 0);
        setField(term7401, term7401.getClass(), "req", null);
        setField(term7401, term7401.getClass(), "url", null);
        setField(term7401, term7401.getClass(), "method", null);
        setField(term7401, term7401.getClass(), "headers", term7405);
        setField(term7401, term7401.getClass(), "cookies", term7411);
        setField(term7330, term7330.getClass(), "res", term7401);
    }

    @Test
    public void test() throws Throwable, Throwable {
        Class<?> klass = Class.forName("org.jsoup.helper.HttpConnection");
        Class<?>[] argTypes = new Class<?>[1];
        argTypes[0] = Class.forName("java.lang.String");
        Object[] args = new Object[1];
        args[0] = "Ghbwtircqb";
        try {
            callMethod(klass, "postDataCharset", argTypes, term7330, args);
            assertTrue(false);
        }
        catch (IllegalCharsetNameException e) {
        }

    }

};


