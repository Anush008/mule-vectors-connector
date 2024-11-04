package org.mule.mulechain.vectors.internal.helpers;

import java.util.Set;

import org.mule.runtime.api.value.Value;
import org.mule.runtime.extension.api.values.ValueBuilder;
import org.mule.runtime.extension.api.values.ValueProvider;
import org.mule.runtime.extension.api.values.ValueResolvingException;

public class MuleChainVectorsEmbeddingModelTypeProvider implements ValueProvider {

  @Override
  public Set<Value> resolve() throws ValueResolvingException {
//aw    return ValueBuilder.getValuesFor("OPENAI", "MISTRAL_AI", "NOMIC", "HUGGING_FACE"); //"OLLAMA", "COHERE", "AZURE_OPENAI", "HUGGING_FACE";
    return ValueBuilder.getValuesFor("OPENAI", "MISTRAL_AI", "NOMIC", "HUGGING_FACE", "AZURE_OPENAI"); //"OLLAMA", "COHERE", "AZURE_OPENAI", "HUGGING_FACE";
}

}
