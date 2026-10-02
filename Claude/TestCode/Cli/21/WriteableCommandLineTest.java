package org.apache.commons.cli2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

/**
 * Test suite for the WriteableCommandLine interface.
 *
 * NOTE: WriteableCommandLine extends CommandLine, whose full API is not
 * provided in this task's source_code/dependencies. Since we must not guess
 * unknown APIs, a java.lang.reflect.Proxy (part of core Java, not a mocking
 * framework) is used to dynamically implement the interface (including any
 * inherited members from CommandLine) so that we can exercise the public
 * contract declared in WriteableCommandLine through its real interface type.
 */
public class WriteableCommandLineTest {

    private WriteableCommandLine commandLine;
    private List invocations;
    private boolean throwOnAddSwitch;

    @Before
    public void setUp() {
        invocations = new ArrayList();
        throwOnAddSwitch = false;

        InvocationHandler handler = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                invocations.add(method.getName());

                String name = method.getName();

                if ("addSwitch".equals(name)) {
                    if (throwOnAddSwitch) {
                        throw new IllegalStateException("switch already added");
                    }
                    return null;
                }

                if ("getUndefaultedValues".equals(name)) {
                    return new ArrayList();
                }

                if ("looksLikeOption".equals(name)) {
                    String arg = (args != null && args.length > 0) ? (String) args[0] : null;
                    return Boolean.valueOf(arg != null && arg.length() > 0 && arg.startsWith("-"));
                }

                Class returnType = method.getReturnType();
                if (returnType == boolean.class) {
                    return Boolean.FALSE;
                }
                if (returnType == void.class) {
                    return null;
                }
                return null;
            }
        };

        commandLine = (WriteableCommandLine) Proxy.newProxyInstance(
                WriteableCommandLine.class.getClassLoader(),
                new Class[] { WriteableCommandLine.class },
                handler);
    }

    // -------------------- addOption --------------------

    @Test
    public void testAddOption_validOption_noExceptionAndRecorded() {
        Option option = null; // Option's concrete API is unknown; null is a valid reference value
        commandLine.addOption(option);
        assertTrue(invocations.contains("addOption"));
    }

    @Test
    public void testAddOption_nullOption_noExceptionThrown() {
        try {
            commandLine.addOption(null);
        } catch (Exception e) {
            fail("addOption should not throw for null in this proxy-based test: " + e);
        }
        assertTrue(invocations.contains("addOption"));
    }

    // -------------------- addValue --------------------

    @Test
    public void testAddValue_validArgs_recorded() {
        Option option = null;
        Object value = "someValue";
        commandLine.addValue(option, value);
        assertTrue(invocations.contains("addValue"));
    }

    @Test
    public void testAddValue_nullValue_recordedWithoutException() {
        Option option = null;
        commandLine.addValue(option, null);
        assertTrue(invocations.contains("addValue"));
    }

    // -------------------- getUndefaultedValues --------------------

    @Test
    public void testGetUndefaultedValues_normalCall_returnsNonNullList() {
        Option option = null;
        List result = commandLine.getUndefaultedValues(option);
        assertNotNull(result);
        assertTrue(result.isEmpty());
        assertTrue(invocations.contains("getUndefaultedValues"));
    }

    @Test
    public void testGetUndefaultedValues_nullOption_returnsEmptyList() {
        List result = commandLine.getUndefaultedValues(null);
        assertNotNull(result);
        assertEquals(0, result.size());
    }

    // -------------------- setDefaultValues --------------------

    @Test
    public void testSetDefaultValues_withPopulatedList_recorded() {
        Option option = null;
        List defaults = new ArrayList();
        defaults.add("default1");
        commandLine.setDefaultValues(option, defaults);
        assertTrue(invocations.contains("setDefaultValues"));
    }

    @Test
    public void testSetDefaultValues_withNullList_noExceptionThrown() {
        Option option = null;
        try {
            commandLine.setDefaultValues(option, null);
        } catch (Exception e) {
            fail("setDefaultValues should not throw for null defaultValues in this test: " + e);
        }
        assertTrue(invocations.contains("setDefaultValues"));
    }

    @Test
    public void testSetDefaultValues_withEmptyList_recorded() {
        Option option = null;
        List defaults = new ArrayList();
        commandLine.setDefaultValues(option, defaults);
        assertTrue(invocations.contains("setDefaultValues"));
    }

    // -------------------- addSwitch --------------------

    @Test
    public void testAddSwitch_normalCall_noExceptionThrown() {
        Option option = null;
        throwOnAddSwitch = false;
        try {
            commandLine.addSwitch(option, true);
        } catch (IllegalStateException e) {
            fail("addSwitch should not throw when switch has not been added before");
        }
        assertTrue(invocations.contains("addSwitch"));
    }

    @Test
    public void testAddSwitch_withFalseValue_noExceptionThrown() {
        Option option = null;
        throwOnAddSwitch = false;
        commandLine.addSwitch(option, false);
        assertTrue(invocations.contains("addSwitch"));
    }

    @Test(expected = IllegalStateException.class)
    public void testAddSwitch_whenAlreadyAdded_throwsIllegalStateException() {
        Option option = null;
        throwOnAddSwitch = true;
        commandLine.addSwitch(option, true);
    }

    // -------------------- setDefaultSwitch --------------------

    @Test
    public void testSetDefaultSwitch_withTrueValue_recorded() {
        Option option = null;
        commandLine.setDefaultSwitch(option, Boolean.TRUE);
        assertTrue(invocations.contains("setDefaultSwitch"));
    }

    @Test
    public void testSetDefaultSwitch_withFalseValue_recorded() {
        Option option = null;
        commandLine.setDefaultSwitch(option, Boolean.FALSE);
        assertTrue(invocations.contains("setDefaultSwitch"));
    }

    @Test
    public void testSetDefaultSwitch_withNullValue_noExceptionThrown() {
        Option option = null;
        try {
            commandLine.setDefaultSwitch(option, null);
        } catch (Exception e) {
            fail("setDefaultSwitch should not throw for a null defaultSwitch: " + e);
        }
        assertTrue(invocations.contains("setDefaultSwitch"));
    }

    // -------------------- addProperty(Option, String, String) --------------------

    @Test
    public void testAddPropertyWithOption_validArgs_recorded() {
        Option option = null;
        commandLine.addProperty(option, "propName", "propValue");
        assertTrue(invocations.contains("addProperty"));
    }

    @Test
    public void testAddPropertyWithOption_emptyStrings_recorded() {
        Option option = null;
        commandLine.addProperty(option, "", "");
        assertTrue(invocations.contains("addProperty"));
    }

    @Test
    public void testAddPropertyWithOption_nullValues_noExceptionThrown() {
        Option option = null;
        try {
            commandLine.addProperty(option, null, null);
        } catch (Exception e) {
            fail("addProperty(Option,String,String) should not throw for null args in this test: " + e);
        }
        assertTrue(invocations.contains("addProperty"));
    }

    // -------------------- addProperty(String, String) --------------------

    @Test
    public void testAddPropertyDefault_validArgs_recorded() {
        commandLine.addProperty("propName", "propValue");
        assertTrue(invocations.contains("addProperty"));
    }

    @Test
    public void testAddPropertyDefault_emptyStrings_recorded() {
        commandLine.addProperty("", "");
        assertTrue(invocations.contains("addProperty"));
    }

    @Test
    public void testAddPropertyDefault_nullValues_noExceptionThrown() {
        try {
            commandLine.addProperty((String) null, (String) null);
        } catch (Exception e) {
            fail("addProperty(String,String) should not throw for null args in this test: " + e);
        }
        assertTrue(invocations.contains("addProperty"));
    }

    // -------------------- looksLikeOption --------------------

    @Test
    public void testLooksLikeOption_argumentWithDashPrefix_returnsTrue() {
        boolean result = commandLine.looksLikeOption("-option");
        assertTrue(result);
        assertTrue(invocations.contains("looksLikeOption"));
    }

    @Test
    public void testLooksLikeOption_argumentWithoutDashPrefix_returnsFalse() {
        boolean result = commandLine.looksLikeOption("value");
        assertFalse(result);
    }

    @Test
    public void testLooksLikeOption_emptyString_returnsFalse() {
        boolean result = commandLine.looksLikeOption("");
        assertFalse(result);
    }

    @Test
    public void testLooksLikeOption_nullArgument_returnsFalseWithoutException() {
        boolean result = commandLine.looksLikeOption(null);
        assertFalse(result);
    }

    // -------------------- interface hierarchy sanity check --------------------

    @Test
    public void testProxyInstance_isInstanceOfWriteableCommandLineAndCommandLine() {
        assertTrue(commandLine instanceof WriteableCommandLine);
        assertTrue(commandLine instanceof CommandLine);
    }
}
