/**
 *
 * $Id$
 */
package net.opengis.ows10.validation;


/**
 * A sample validator interface for {@link net.opengis.ows10.TelephoneType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TelephoneTypeValidator {
  boolean validate();

  boolean validateVoice(String value);
  boolean validateFacsimile(String value);
}
